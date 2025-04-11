// Interface 1: Printable
interface Printable {
    void print();
}

// Interface 2: Storable
interface Storable {
    void save();
}

// Class implementing both interfaces (achieving a form of multiple inheritance)
class Document implements Printable, Storable {
    String content;

    public Document(String content) {
        this.content = content;
        System.out.println("Document created.");
    }

    @Override
    public void print() {
        System.out.println("Printing document: " + content);
    }

    @Override
    public void save() {
        System.out.println("Saving document: " + content + " to storage.");
    }

    public void displayInfo() {
        System.out.println("Document Content: " + content);
    }
}

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        Document myDocument = new Document("This is the content of my document.");

        System.out.println("\n--- Document Actions ---");
        myDocument.displayInfo();
        myDocument.print();
        myDocument.save();

        // Polymorphism: Treating the Document object as instances of its implemented interfaces
        Printable printableDoc = myDocument;
        System.out.println("\n--- Printable Interface ---");
        printableDoc.print(); // Calls the print() method of the Document class
        // printableDoc.save(); // Error: Printable interface doesn't have save()

        Storable storableDoc = myDocument;
        System.out.println("\n--- Storable Interface ---");
        storableDoc.save(); // Calls the save() method of the Document class
        // storableDoc.print(); // Error: Storable interface doesn't have print()
    }
}