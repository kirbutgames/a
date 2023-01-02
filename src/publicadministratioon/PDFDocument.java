package publicadministratioon;

import data.DigitalSignature;
import data.DocPath;
import data.Goal;
import data.Nif;

import javax.print.Doc;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class PDFDocument { // Represents a PDF document
    private Date creatDate;
    private DocPath path;
    private File file;

    public PDFDocument (Date create, DocPath rute) {
        this.creatDate=create;
        this.path=rute;
        this.file=new File(rute.getDocPath());
    } // Initializes attributes and emulates the document download at a default path

    // the getters
    @Override
    public String toString () {return "CardPayment{" + "creatDate='" + creatDate +
                                                        "path='" +path + '}';} // converts to String// Converts to String members Date & DocPath
    // To implement only optionally
    public void moveDoc (DocPath destPath) throws IOException{
        File files = new File(destPath.getDocPath());
        if(files.renameTo(new File(destPath.getDocPath()))){
            files.delete();
        }else{
            throw new IOException("Can't move");
        }
    } // Moves the document to the destination path indicated
    public void openDoc (DocPath path) throws IOException {
        File files = new File(path.getDocPath());
        if(files.exists()){
            Desktop.getDesktop().open(files);
        }else{
            throw new IOException("Can't open");
        }
    } // Opens the document at the path indicated
}

