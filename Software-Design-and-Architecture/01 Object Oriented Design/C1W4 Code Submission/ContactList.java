package com.example.sharingapp;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;


public class ContactList {

    private static ArrayList<Contact> contact_list;
    private String FILENAME = "contacts.sav";

    public ContactList() {
        this.contact_list = new ArrayList<Contact>();
    }

    public void setContacts(ArrayList<Contact> contact_list) {
        this.contact_list = contact_list;
    }

    public ArrayList<Contact> getContacts() {
        return this.contact_list;
    }

    public ArrayList<String> getAllUsernames(){
        ArrayList<String> username_list = new ArrayList<String>();
        for (Contact u : this.contact_list){
            username_list.add(u.getUsername());
        }
        return username_list;
    }

    public void addContact(Contact contact) {
        this.contact_list.add(contact);
    }

    public void deleteContact(Contact contact) {
        this.contact_list.remove(contact);
    }

    public Contact getContact(int index) {
        return this.contact_list.get(index);
    }

    public int getSize() {
        return this.contact_list.size();
    }

    public Contact getContactByUsername(String username){
        for (Contact c : contact_list){
            if (c.getUsername().equals(username)){
                return c;
            }
        }
        return null;
    }

    public boolean hasContact(Contact contact) {
        for (Contact c : contact_list) {
            if (contact.getId().equals(c.getId())) {
                return true;
            }
        }
        return false;
    }

    public int getIndex(Contact contact) {
        int index = 0;
        for (Contact c : contact_list) {
            if (contact.getId().equals(c.getId())) {
                return index;
            }
            index = index+1;
        }
        return -1;
    }

    public boolean isUsernameAvailable(String username){
        for (Contact c : contact_list) {
            if (c.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }

    public void loadContacts(Context context) {

        try {
            FileInputStream fis = context.openFileInput(FILENAME);
            InputStreamReader isr = new InputStreamReader(fis);
            Gson gson = new Gson();
            Type listType = new TypeToken<ArrayList<Contact>>() {}.getType();
            contact_list = gson.fromJson(isr, listType); // temporary
            fis.close();
        } catch (FileNotFoundException e) {
            contact_list = new ArrayList<Contact>();
        } catch (IOException e) {
            contact_list = new ArrayList<Contact>();
        }
    }

    public void saveContacts(Context context) {
        try {
            FileOutputStream fos = context.openFileOutput(FILENAME, 0);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            Gson gson = new Gson();
            gson.toJson(contact_list, osw);
            osw.flush();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}