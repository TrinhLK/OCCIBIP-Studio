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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.core.Action#getActiontype <em>Actiontype</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.core.OCCIPackage#getAction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CorrectScheme'"
 * @generated
 */
public interface Action extends Category {

	/**
	 * Returns the value of the '<em><b>Actiontype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actiontype</em>' attribute.
	 * @see #setActiontype(String)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getAction_Actiontype()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getActiontype();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.Action#getActiontype <em>Actiontype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actiontype</em>' attribute.
	 * @see #getActiontype()
	 * @generated
	 */
	void setActiontype(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\t\t\t\tstatus: Boolean= \n\t\t\t\t\t\t\t\tif(self.oclContainer.oclIsTypeOf(Kind))\n\t\t\t\t\t\t\t\tthen \n\t\t\t\t\t\t\t\t\tif (self.oclContainer().oclAsType(Kind).fsm &lt;&gt; null) \n\t\t\t\t\t\t\t\t\tthen \n\t\t\t\t\t\t\t\t \t\tself.oclContainer().oclAsType(Kind).fsm.ownedState.outgoingTransition.action-&gt;includes(self) \n\t\t\t\t\t\t\t\t \telse \n\t\t\t\t\t\t\t\t \t\ttrue \n\t\t\t\t\t\t\t\t \tendif\n\t\t\t\t\t\t\t\t else\n\t\t\t\t\t\t\t\t \ttrue \n\t\t\t\t\t\t\t\t endif,\n\t\t\t\tmessage: String =\'The action \'+name+\' doesn\\\'t appear in the FSM of \'+self.oclContainer().oclAsType(Kind).name +\' Kind\',\n\t\t\t\tseverity :Integer = 1,\n\t\t\t\tquickfix:String = \'quickfix\'\n\t\t\t\t}.status'"
	 * @generated
	 */
	boolean containedAction(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let category = oclContainer().oclAsType(Category)\n\t\t\tin scheme = category.scheme.substring(1, category.scheme.size() - 1) + \'/\' + category.term + \'/action#\''"
	 * @generated
	 */
	boolean CorrectScheme(DiagnosticChain diagnostics, Map<Object, Object> context);
} // Action
