// Document Interface
interface Document {
  void open();
  void save();
}

// Concrete Document Classes
class WordDocument implements Document {
  public void open() { 
        System.out.println("Opening Word doc"); 
    }
  public void save() { 
        System.out.println("Saving as .docx"); 
    }
}

class PdfDocument implements Document {
  public void open() { 
        System.out.println("Opening PDF"); 
    }
  public void save() { 
        System.out.println("Saving as .pdf"); 
    }
}

class ExcelDocument implements Document {
  public void open() { 
        System.out.println("Opening Excel"); 
    }
  public void save() { 
        System.out.println("Saving as .xlsx"); 
    }

}

// Abstract Factory Class
abstract class DocumentFactory {
  public abstract Document createDocument();
  public void openDocument() { 
        createDocument().open(); 
    }
}

class WordFactory  extends DocumentFactory {
  public Document createDocument() { 
        return new WordDocument(); 
    }
}

class PdfFactory   extends DocumentFactory {
  public Document createDocument() { 
    return new PdfDocument(); 
 }
}

class ExcelFactory extends DocumentFactory {
  public Document createDocument() { 
        return new ExcelDocument(); 
    }
}

// Test Class
public class FactoryMethodTest {
    public static void main(String[] args) {

        DocumentFactory wordFactory = new WordFactory();
        DocumentFactory pdfFactory = new PdfFactory();
        DocumentFactory excelFactory = new ExcelFactory();

        // Open documents using the factories
        wordFactory.openDocument();
        pdfFactory.openDocument();
        excelFactory.openDocument();

        // Create and save documents using the factories
        Document wordDoc = wordFactory.createDocument();
        Document pdfDoc = pdfFactory.createDocument();
        Document excelDoc = excelFactory.createDocument();

        wordDoc.save();
        pdfDoc.save();
        excelDoc.save();
    }
}