/**
 */
package sQL2AMN.amn.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import sQL2AMN.amn.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see sQL2AMN.amn.AmnPackage
 * @generated
 */
public class AmnSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AmnPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmnSwitch() {
		if (modelPackage == null) {
			modelPackage = AmnPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case AmnPackage.AMN_MACHINE: {
			AMNMachine amnMachine = (AMNMachine) theEObject;
			T result = caseAMNMachine(amnMachine);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AmnPackage.VARIABLE: {
			Variable variable = (Variable) theEObject;
			T result = caseVariable(variable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AmnPackage.OPERATION: {
			Operation operation = (Operation) theEObject;
			T result = caseOperation(operation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AmnPackage.SUBSTITUTION: {
			Substitution substitution = (Substitution) theEObject;
			T result = caseSubstitution(substitution);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AmnPackage.STRING_LITERAL: {
			StringLiteral stringLiteral = (StringLiteral) theEObject;
			T result = caseStringLiteral(stringLiteral);
			if (result == null)
				result = caseExpression(stringLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AmnPackage.VAR_REF: {
			VarRef varRef = (VarRef) theEObject;
			T result = caseVarRef(varRef);
			if (result == null)
				result = caseExpression(varRef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AmnPackage.SET_MEMBERSHIP: {
			SetMembership setMembership = (SetMembership) theEObject;
			T result = caseSetMembership(setMembership);
			if (result == null)
				result = caseExpression(setMembership);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AmnPackage.CONJUCTION: {
			Conjuction conjuction = (Conjuction) theEObject;
			T result = caseConjuction(conjuction);
			if (result == null)
				result = caseExpression(conjuction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AmnPackage.INVARIANT_PREDICATE: {
			InvariantPredicate invariantPredicate = (InvariantPredicate) theEObject;
			T result = caseInvariantPredicate(invariantPredicate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AmnPackage.SET_DEFINITION: {
			SetDefinition setDefinition = (SetDefinition) theEObject;
			T result = caseSetDefinition(setDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AmnPackage.EXPRESSION: {
			Expression expression = (Expression) theEObject;
			T result = caseExpression(expression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AmnPackage.ASSIGN_SUBTITUTION: {
			AssignSubtitution assignSubtitution = (AssignSubtitution) theEObject;
			T result = caseAssignSubtitution(assignSubtitution);
			if (result == null)
				result = caseSubstitution(assignSubtitution);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AmnPackage.SKIP_SUBTITUTION: {
			SkipSubtitution skipSubtitution = (SkipSubtitution) theEObject;
			T result = caseSkipSubtitution(skipSubtitution);
			if (result == null)
				result = caseSubstitution(skipSubtitution);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AmnPackage.ANY_SUBTITUTION: {
			AnySubtitution anySubtitution = (AnySubtitution) theEObject;
			T result = caseAnySubtitution(anySubtitution);
			if (result == null)
				result = caseSubstitution(anySubtitution);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AmnPackage.SELECT_SUBTITUTION: {
			SelectSubtitution selectSubtitution = (SelectSubtitution) theEObject;
			T result = caseSelectSubtitution(selectSubtitution);
			if (result == null)
				result = caseSubstitution(selectSubtitution);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AmnPackage.IF_SUBTITUTION: {
			IfSubtitution ifSubtitution = (IfSubtitution) theEObject;
			T result = caseIfSubtitution(ifSubtitution);
			if (result == null)
				result = caseSubstitution(ifSubtitution);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AmnPackage.SEQUENTIAL_SUBTITUTION: {
			SequentialSubtitution sequentialSubtitution = (SequentialSubtitution) theEObject;
			T result = caseSequentialSubtitution(sequentialSubtitution);
			if (result == null)
				result = caseSubstitution(sequentialSubtitution);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AmnPackage.PRE_SUBTITUTION: {
			PreSubtitution preSubtitution = (PreSubtitution) theEObject;
			T result = casePreSubtitution(preSubtitution);
			if (result == null)
				result = caseSubstitution(preSubtitution);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AMN Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AMN Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAMNMachine(AMNMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substitution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substitution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstitution(Substitution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringLiteral(StringLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarRef(VarRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Membership</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Membership</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetMembership(SetMembership object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conjuction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conjuction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConjuction(Conjuction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invariant Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invariant Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvariantPredicate(InvariantPredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetDefinition(SetDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assign Subtitution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assign Subtitution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignSubtitution(AssignSubtitution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Skip Subtitution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Skip Subtitution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSkipSubtitution(SkipSubtitution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Any Subtitution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Any Subtitution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnySubtitution(AnySubtitution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Select Subtitution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Select Subtitution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectSubtitution(SelectSubtitution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Subtitution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Subtitution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfSubtitution(IfSubtitution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequential Subtitution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequential Subtitution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequentialSubtitution(SequentialSubtitution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pre Subtitution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pre Subtitution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreSubtitution(PreSubtitution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AmnSwitch
