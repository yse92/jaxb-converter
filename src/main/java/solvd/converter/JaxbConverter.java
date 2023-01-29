package solvd.converter;

import org.xml.sax.InputSource;
import solvd.models.Branch;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.FileOutputStream;

public class JaxbConverter {
    public static <T> void marshall(T objToSerialize, String fileName)
    {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(objToSerialize.getClass());
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
            jaxbMarshaller.marshal(objToSerialize, new FileOutputStream(fileName));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static <T> T unmarshall(String xml, Class<T> instance)
            throws JAXBException {
        JAXBContext jc = JAXBContext.newInstance(instance);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        T obj = instance.cast(unmarshaller.unmarshal((new InputSource(xml))));
        return obj;
    }
}
