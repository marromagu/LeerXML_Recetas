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
            // Crear una instancia de DocumentBuilder
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Analizar el archivo XML
            Document document = builder.parse("RecetaDOM.xml");

            // Acceder a los elementos del documento
            Element rootElement = document.getDocumentElement(); // Elemento raíz del documento
            System.out.println("Elemento raiz: " + rootElement.getNodeName());

            // Recorrer todos los elementos del documento
            recurvivaDeLeerXMLconDOM(rootElement);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void recurvivaDeLeerXMLconDOM(Element elementoPadre) {
        NodeList elementosHijos = elementoPadre.getChildNodes();
        for (int i = 0; i < elementosHijos.getLength(); i++) {
            if (elementosHijos.item(i).getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {
                Element elementoHijo = (Element) elementosHijos.item(i);
                System.out.println(" \tElemento hijo: " + elementoHijo.getNodeName());
                System.out.println(" \t\tContenido de texto: " + elementoHijo.getTextContent());
            }
        }
    }
}
