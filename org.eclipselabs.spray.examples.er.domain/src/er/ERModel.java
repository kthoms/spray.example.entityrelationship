/**
 */
package er;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ER Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link er.ERModel#getEntities <em>Entities</em>}</li>
 *   <li>{@link er.ERModel#getRelationships <em>Relationships</em>}</li>
 * </ul>
 * </p>
 *
 * @see er.ErPackage#getERModel()
 * @model
 * @generated
 */
public interface ERModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link er.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see er.ErPackage#getERModel_Entities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getEntities();

	/**
	 * Returns the value of the '<em><b>Relationships</b></em>' containment reference list.
	 * The list contents are of type {@link er.Relationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationships</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationships</em>' containment reference list.
	 * @see er.ErPackage#getERModel_Relationships()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relationship> getRelationships();

} // ERModel
