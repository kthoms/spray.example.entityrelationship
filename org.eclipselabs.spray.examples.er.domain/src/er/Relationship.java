/**
 */
package er;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link er.Relationship#getFromEntity <em>From Entity</em>}</li>
 *   <li>{@link er.Relationship#getToEntity <em>To Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see er.ErPackage#getRelationship()
 * @model
 * @generated
 */
public interface Relationship extends EObject {
	/**
	 * Returns the value of the '<em><b>From Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Entity</em>' reference.
	 * @see #setFromEntity(Entity)
	 * @see er.ErPackage#getRelationship_FromEntity()
	 * @model required="true"
	 * @generated
	 */
	Entity getFromEntity();

	/**
	 * Sets the value of the '{@link er.Relationship#getFromEntity <em>From Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Entity</em>' reference.
	 * @see #getFromEntity()
	 * @generated
	 */
	void setFromEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>To Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Entity</em>' reference.
	 * @see #setToEntity(Entity)
	 * @see er.ErPackage#getRelationship_ToEntity()
	 * @model required="true"
	 * @generated
	 */
	Entity getToEntity();

	/**
	 * Sets the value of the '{@link er.Relationship#getToEntity <em>To Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Entity</em>' reference.
	 * @see #getToEntity()
	 * @generated
	 */
	void setToEntity(Entity value);

} // Relationship
