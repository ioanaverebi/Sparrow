/**
 * generated by Xtext 2.10.0
 */
package org.refactor.modelEditor.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.refactor.modelEditor.Access;
import org.refactor.modelEditor.Field;
import org.refactor.modelEditor.ModelEditorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.refactor.modelEditor.impl.AccessImpl#getAccesses <em>Accesses</em>}</li>
 *   <li>{@link org.refactor.modelEditor.impl.AccessImpl#getField <em>Field</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccessImpl extends MinimalEObjectImpl.Container implements Access
{
  /**
   * The default value of the '{@link #getAccesses() <em>Accesses</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccesses()
   * @generated
   * @ordered
   */
  protected static final int ACCESSES_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getAccesses() <em>Accesses</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccesses()
   * @generated
   * @ordered
   */
  protected int accesses = ACCESSES_EDEFAULT;

  /**
   * The cached value of the '{@link #getField() <em>Field</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getField()
   * @generated
   * @ordered
   */
  protected Field field;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AccessImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ModelEditorPackage.Literals.ACCESS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getAccesses()
  {
    return accesses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAccesses(int newAccesses)
  {
    int oldAccesses = accesses;
    accesses = newAccesses;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelEditorPackage.ACCESS__ACCESSES, oldAccesses, accesses));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field getField()
  {
    if (field != null && field.eIsProxy())
    {
      InternalEObject oldField = (InternalEObject)field;
      field = (Field)eResolveProxy(oldField);
      if (field != oldField)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelEditorPackage.ACCESS__FIELD, oldField, field));
      }
    }
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field basicGetField()
  {
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setField(Field newField)
  {
    Field oldField = field;
    field = newField;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelEditorPackage.ACCESS__FIELD, oldField, field));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ModelEditorPackage.ACCESS__ACCESSES:
        return getAccesses();
      case ModelEditorPackage.ACCESS__FIELD:
        if (resolve) return getField();
        return basicGetField();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ModelEditorPackage.ACCESS__ACCESSES:
        setAccesses((Integer)newValue);
        return;
      case ModelEditorPackage.ACCESS__FIELD:
        setField((Field)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ModelEditorPackage.ACCESS__ACCESSES:
        setAccesses(ACCESSES_EDEFAULT);
        return;
      case ModelEditorPackage.ACCESS__FIELD:
        setField((Field)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ModelEditorPackage.ACCESS__ACCESSES:
        return accesses != ACCESSES_EDEFAULT;
      case ModelEditorPackage.ACCESS__FIELD:
        return field != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (accesses: ");
    result.append(accesses);
    result.append(')');
    return result.toString();
  }

} //AccessImpl
