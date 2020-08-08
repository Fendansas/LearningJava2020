package com.epam.home.task9;

import java.io.*;

public class NoteStoringServiceImpl implements NoteStoringService {

    private static String FILENAME = "noteStorage.txt";

    @Override
    public void saveNote(Notebook notebook) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(FILENAME);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)
        ) {
            objectOutputStream.writeObject(notebook);
            System.out.println("Notebook is saved: " + notebook);
        } catch (IOException e) {
            System.out.println("An exception occurred during saving notebook: " + notebook);
            e.printStackTrace();
        }
    }

    @Override
    public Notebook readNote() {
        Notebook notebook = null;
        try (FileInputStream fileInputStream = new FileInputStream(FILENAME);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)
        ) {
            Object object = objectInputStream.readObject();
            if (object instanceof Notebook) {
                notebook = (Notebook) object;
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("An exception occurred during reading notebook.");
            e.printStackTrace();
        }
        return notebook;
    }
}

