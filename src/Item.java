/*
 *	Item
 */

import com.google.gson.*;
import java.io.*;

public class Item {

    private String name;
    private String description;

    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public boolean equals(Item item_comp) {
        return this.name.equals(item_comp.getName()) && this.description.equals(item_comp.getDescription());
    }

    public String getDescription() {
        return this.description;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + ": " + this.description;
    }
}
