/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModificarCopiar;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 *
 * @author mario
 */
public class Recetas {

    //Como Supuestamente leer un XML con DOM
    public void leerXMLconDOM() {
        try {
            // Paso 1: Crear una instancia de DocumentBuilder
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Paso 2: Analizar el archivo XML
            Document document = builder.parse("RecetaDOM.xml");

            // Paso 3: Acceder a los elementos del documento
            Element rootElement = document.getDocumentElement(); // Elemento raíz del documento

            System.out.println("Elemento raíz: " + rootElement.getNodeName());

            //  Acceder a elementos secundarios
            NodeList elementosHijos = rootElement.getChildNodes();
            for (int i = 0; i < elementosHijos.getLength(); i++) {
                if (elementosHijos.item(i).getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {
                    Element elementoHijo = (Element) elementosHijos.item(i);
                    System.out.println("Elemento hijo: " + elementoHijo.getNodeName());

                    // Acceder a los atributos y contenido de texto de este elemento si los tiene
                    String atributo = elementoHijo.getAttribute("Nombre Del Atributo");
                    String texto = elementoHijo.getTextContent();
                    System.out.println("Atributo: " + atributo);
                    System.out.println("Contenido de texto: " + texto);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
