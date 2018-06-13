package ua.org.oa.Hw6;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class WorkWithBooks {
    public static void addBooks(String file, boolean append, Book... books)
    {
        try (BufferedWriter bw=new BufferedWriter(new FileWriter(file,append))){
            for (Book b:books) {
                String s = b.getAuthor() + ";" + b.getTitle() + ";" + b.getYear();
                bw.write(s);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Collection<Book> getBook(String file, String coding) {
        Collection<Book> ret=new ArrayList<>();
        try (BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(file),coding))){
            String read;
            while ((read=br.readLine())!=null){
                String[] r=read.split("[;]+");
                int y=Integer.parseInt(r[2]);
                ret.add(new Book(r[1],r[0],y));
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ret;
    }

    public static void serializable(String fileName, Collection<Book> books){
        try (ObjectOutput bookOut=new ObjectOutputStream(new FileOutputStream(fileName,false))){

            for (Book b:books){
                bookOut.writeObject(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Book> deSerializable(String fileName){
        List<Book> ret=new ArrayList<>();
        try (ObjectInputStream bookOut=new ObjectInputStream(new FileInputStream(fileName))){
            while (true){
                ret.add((Book)bookOut.readObject());
            }
        }catch (EOFException e){
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return ret;
    }
}


