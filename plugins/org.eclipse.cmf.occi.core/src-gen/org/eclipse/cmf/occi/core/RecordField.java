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
 * A representation of the model object '<em><b>Record Field</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.cmf.occi.core.OCCIPackage#getRecordField()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ContainerMustBeRecordType'"
 * @generated
 */
public interface RecordField extends Attribute {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.type &lt;&gt; self.oclContainer'"
	 * @generated
	 */
	boolean TypeDifferentContainer(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.name.matches(\'[a-zA-Z][a-zA-Z0-9]*\')'"
	 * @generated
	 */
	boolean RecordFieldNameRegex(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.oclContainer.oclIsTypeOf(occi::RecordType)'"
	 * @generated
	 */
	boolean ContainerMustBeRecordType(DiagnosticChain diagnostics, Map<Object, Object> context);

} // RecordField
