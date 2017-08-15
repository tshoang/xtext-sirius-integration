/**
 * generated by Xtext 2.12.0
 */
package nl.altran.example.xtext.html.htmlLang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Paragraph</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link nl.altran.example.xtext.html.htmlLang.Paragraph#getContents
 * <em>Contents</em>}</li>
 * </ul>
 *
 * @see nl.altran.example.xtext.html.htmlLang.HtmlLangPackage#getParagraph()
 * @model
 * @generated
 */
public interface Paragraph extends BodyContents {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link nl.altran.example.xtext.html.htmlLang.TextElement}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see nl.altran.example.xtext.html.htmlLang.HtmlLangPackage#getParagraph_Contents()
	 * @model containment="true"
	 * @generated
	 */
	EList<TextElement> getContents();

} // Paragraph
