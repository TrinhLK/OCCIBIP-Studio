/**
 * Copyright (c) 2017 Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Faiez Zalila <faiez.zalila@inria.fr>
 */
package org.eclipse.cmf.occi.core;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.core.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Transition#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.core.OCCIPackage#getTransition()
 * @model extendedMetaData="name='State'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='containedActionMustBeDeclaredInTheAppropriateType'"
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.cmf.occi.core.State#getOutgoingTransition <em>Outgoing Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see #setSource(State)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getTransition_Source()
	 * @see org.eclipse.cmf.occi.core.State#getOutgoingTransition
	 * @model opposite="outgoingTransition" required="true" transient="false"
	 * @generated
	 */
	State getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.Transition#getSource <em>Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' container reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(State value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getTransition_Target()
	 * @model required="true"
	 * @generated
	 */
	State getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(State value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(Action)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getTransition_Action()
	 * @model extendedMetaData="name='State'"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.Transition#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\t\t\t\tstatus: Boolean= let type: Type = self.oclContainer().oclAsType(State).oclContainer().oclAsType(FSM).oclContainer().oclAsType(Type) in \n\t\t\t\t\t\t\t\tif (self.action &lt;&gt; null) \n\t\t\t\t\t\t\t\t then \n\t\t\t\t\t\t\t\t \ttype.actions-&gt;union(type.oclAsType(Kind)-&gt;closure(parent)-&gt;flatten()-&gt;collect(k|k.actions)-&gt;flatten())-&gt;includes(self.action)\n\t\t\t\t\t\t\t\t else\n\t\t\t\t\t\t\t\t \tfalse\n\t\t\t\t\t\t\t\t endif,\n\t\t\t\tmessage: String =if (self.action &lt;&gt; null)  \n\t\t\t\t\t\t\t\t\tthen \'The action \'+ self.action.name +\' declared in \'+self.action.oclContainer().oclAsType(Type).name+\n\t\t\t\t\t\t\t\t \t\t\t\' kind/mixin cannot be used in the FSM of \'+self.oclContainer().oclAsType(State).oclContainer().oclAsType(FSM).oclContainer().oclAsType(Type).name+\' kind/mixin.\'\n\t\t\t\t\t\t\t\t \telse\n\t\t\t\t\t\t\t\t \t\t\'The action of Transition instance coming from the \"\'+ source.literal.name +\'\" state to the \"\' +target.literal.name + \'\" state in the FSM of \"\' + source.owningFSM.oclContainer().oclAsType(Type).name+ \'\" kind/mixin instance must be a set\'\n\t\t\t\t\t\t\t\t \tendif\n\t\t\t\t\t\t\t\t \t,\n\t\t\t\tseverity :Integer = -1\n\t\t\t\t}.status'"
	 * @generated
	 */
	boolean containedActionMustBeDeclaredInTheAppropriateType(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Transition
