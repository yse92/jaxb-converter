package solvd;

import solvd.converter.JaxbConverter;
import solvd.models.*;
import solvd.util.FilePropertiesUtil;
import solvd.util.Generator;

import javax.xml.bind.JAXBException;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws JAXBException, ParseException {

        /* Initialize bank hierarchy */

        Branches branches = Generator.generateBranches();

        /* Object to XML */

        //JaxbConverter.marshall(branches, new FilePropertiesUtil().getPath()); //OK

        /* XML to Object */

        //Branches branches2 = JaxbConverter.unmarshall(new FilePropertiesUtil().getPath(), Branches.class);
        //System.out.println(branches2.toString());
    }
}
