package solvd;

import solvd.converter.JaxbConverter;
import solvd.models.*;
import solvd.util.Constants;
import solvd.util.Generator;

import javax.xml.bind.JAXBException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws JAXBException {

        /* Initialize bank hierarchy */

        Generator.generate();

        /* Object to XML */

        //JaxbConverter.marshall(branches, Constants.bankPath);

        /* XML to Object */

        //Branches branches2 = JaxbConverter.unmarshall(Constants.bankPath, Branches.class);
        //System.out.println(branches2.toString());
    }
}
