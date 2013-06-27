/**
 */
package er.impl;

import er.Entity;
import er.ErPackage;
import er.Relationship;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link er.impl.RelationshipImpl#getFromEntity <em>From Entity</em>}</li>
 *   <li>{@link er.impl.RelationshipImpl#getToEntity <em>To Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationshipImpl extends MinimalEObjectImpl.Container implements Relationship {
	/**
	 * The cached value of the '{@link #getFromEntity() <em>From Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity fromEntity;

	/**
	 * The cached value of the '{@link #getToEntity() <em>To Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity toEntity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErPackage.Literals.RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getFromEntity() {
		if (fromEntity != null && fromEntity.eIsProxy()) {
			InternalEObject oldFromEntity = (InternalEObject)fromEntity;
			fromEntity = (Entity)eResolveProxy(oldFromEntity);
			if (fromEntity != oldFromEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ErPackage.RELATIONSHIP__FROM_ENTITY, oldFromEntity, fromEntity));
			}
		}
		return fromEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetFromEntity() {
		return fromEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromEntity(Entity newFromEntity) {
		Entity oldFromEntity = fromEntity;
		fromEntity = newFromEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErPackage.RELATIONSHIP__FROM_ENTITY, oldFromEntity, fromEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getToEntity() {
		if (toEntity != null && toEntity.eIsProxy()) {
			InternalEObject oldToEntity = (InternalEObject)toEntity;
			toEntity = (Entity)eResolveProxy(oldToEntity);
			if (toEntity != oldToEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ErPackage.RELATIONSHIP__TO_ENTITY, oldToEntity, toEntity));
			}
		}
		return toEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetToEntity() {
		return toEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToEntity(Entity newToEntity) {
		Entity oldToEntity = toEntity;
		toEntity = newToEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErPackage.RELATIONSHIP__TO_ENTITY, oldToEntity, toEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ErPackage.RELATIONSHIP__FROM_ENTITY:
				if (resolve) return getFromEntity();
				return basicGetFromEntity();
			case ErPackage.RELATIONSHIP__TO_ENTITY:
				if (resolve) return getToEntity();
				return basicGetToEntity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ErPackage.RELATIONSHIP__FROM_ENTITY:
				setFromEntity((Entity)newValue);
				return;
			case ErPackage.RELATIONSHIP__TO_ENTITY:
				setToEntity((Entity)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ErPackage.RELATIONSHIP__FROM_ENTITY:
				setFromEntity((Entity)null);
				return;
			case ErPackage.RELATIONSHIP__TO_ENTITY:
				setToEntity((Entity)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ErPackage.RELATIONSHIP__FROM_ENTITY:
				return fromEntity != null;
			case ErPackage.RELATIONSHIP__TO_ENTITY:
				return toEntity != null;
		}
		return super.eIsSet(featureID);
	}

} //RelationshipImpl
