/**
 */
package sQL2AMN.amn.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sQL2AMN.amn.AMNMachine;
import sQL2AMN.amn.AmnPackage;
import sQL2AMN.amn.InvariantPredicate;
import sQL2AMN.amn.Operation;
import sQL2AMN.amn.SetDefinition;
import sQL2AMN.amn.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AMN Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sQL2AMN.amn.impl.AMNMachineImpl#getName <em>Name</em>}</li>
 *   <li>{@link sQL2AMN.amn.impl.AMNMachineImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link sQL2AMN.amn.impl.AMNMachineImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link sQL2AMN.amn.impl.AMNMachineImpl#getInvariants <em>Invariants</em>}</li>
 *   <li>{@link sQL2AMN.amn.impl.AMNMachineImpl#getSets <em>Sets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AMNMachineImpl extends MinimalEObjectImpl.Container implements AMNMachine {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variables;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> operations;

	/**
	 * The cached value of the '{@link #getInvariants() <em>Invariants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvariants()
	 * @generated
	 * @ordered
	 */
	protected EList<InvariantPredicate> invariants;

	/**
	 * The cached value of the '{@link #getSets() <em>Sets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSets()
	 * @generated
	 * @ordered
	 */
	protected EList<SetDefinition> sets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AMNMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmnPackage.Literals.AMN_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmnPackage.AMN_MACHINE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Variable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList<Variable>(Variable.class, this, AmnPackage.AMN_MACHINE__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Operation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<Operation>(Operation.class, this,
					AmnPackage.AMN_MACHINE__OPERATIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InvariantPredicate> getInvariants() {
		if (invariants == null) {
			invariants = new EObjectContainmentEList<InvariantPredicate>(InvariantPredicate.class, this,
					AmnPackage.AMN_MACHINE__INVARIANTS);
		}
		return invariants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SetDefinition> getSets() {
		if (sets == null) {
			sets = new EObjectContainmentEList<SetDefinition>(SetDefinition.class, this, AmnPackage.AMN_MACHINE__SETS);
		}
		return sets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AmnPackage.AMN_MACHINE__VARIABLES:
			return ((InternalEList<?>) getVariables()).basicRemove(otherEnd, msgs);
		case AmnPackage.AMN_MACHINE__OPERATIONS:
			return ((InternalEList<?>) getOperations()).basicRemove(otherEnd, msgs);
		case AmnPackage.AMN_MACHINE__INVARIANTS:
			return ((InternalEList<?>) getInvariants()).basicRemove(otherEnd, msgs);
		case AmnPackage.AMN_MACHINE__SETS:
			return ((InternalEList<?>) getSets()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AmnPackage.AMN_MACHINE__NAME:
			return getName();
		case AmnPackage.AMN_MACHINE__VARIABLES:
			return getVariables();
		case AmnPackage.AMN_MACHINE__OPERATIONS:
			return getOperations();
		case AmnPackage.AMN_MACHINE__INVARIANTS:
			return getInvariants();
		case AmnPackage.AMN_MACHINE__SETS:
			return getSets();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AmnPackage.AMN_MACHINE__NAME:
			setName((String) newValue);
			return;
		case AmnPackage.AMN_MACHINE__VARIABLES:
			getVariables().clear();
			getVariables().addAll((Collection<? extends Variable>) newValue);
			return;
		case AmnPackage.AMN_MACHINE__OPERATIONS:
			getOperations().clear();
			getOperations().addAll((Collection<? extends Operation>) newValue);
			return;
		case AmnPackage.AMN_MACHINE__INVARIANTS:
			getInvariants().clear();
			getInvariants().addAll((Collection<? extends InvariantPredicate>) newValue);
			return;
		case AmnPackage.AMN_MACHINE__SETS:
			getSets().clear();
			getSets().addAll((Collection<? extends SetDefinition>) newValue);
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
		case AmnPackage.AMN_MACHINE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case AmnPackage.AMN_MACHINE__VARIABLES:
			getVariables().clear();
			return;
		case AmnPackage.AMN_MACHINE__OPERATIONS:
			getOperations().clear();
			return;
		case AmnPackage.AMN_MACHINE__INVARIANTS:
			getInvariants().clear();
			return;
		case AmnPackage.AMN_MACHINE__SETS:
			getSets().clear();
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
		case AmnPackage.AMN_MACHINE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case AmnPackage.AMN_MACHINE__VARIABLES:
			return variables != null && !variables.isEmpty();
		case AmnPackage.AMN_MACHINE__OPERATIONS:
			return operations != null && !operations.isEmpty();
		case AmnPackage.AMN_MACHINE__INVARIANTS:
			return invariants != null && !invariants.isEmpty();
		case AmnPackage.AMN_MACHINE__SETS:
			return sets != null && !sets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AMNMachineImpl
