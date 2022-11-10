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
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kind</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.core.Kind#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Kind#getEntities <em>Entities</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Kind#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Kind#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.core.OCCIPackage#getKind()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='sourceReferenceInvariant'"
 * @generated
 */
public interface Kind extends Type {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Kind)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getKind_Parent()
	 * @model
	 * @generated
	 */
	Kind getParent();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.Kind#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Kind value);

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.cmf.occi.core.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' reference list.
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getKind_Entities()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Entity> getEntities();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.cmf.occi.core.Kind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getKind_Source()
	 * @model
	 * @generated
	 */
	EList<Kind> getSource();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.cmf.occi.core.Kind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getKind_Target()
	 * @model
	 * @generated
	 */
	EList<Kind> getTarget();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.cmf.occi.core.Boolean" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\tif (self.parent &lt;&gt; null)\n\t\t\t\t\t\tthen\n\t\t\t\t\t\t\tif(kind &lt;&gt; null)\n\t\t\t\t\t\t\tthen\n\t\t\t\t\t\t\t\tif(self = kind)\n\t\t\t\t\t\t\t\tthen \n\t\t\t\t\t\t\t\t\ttrue\n\t\t\t\t\t\t\t\telse\n\t\t\t\t\t\t\t\t\tif(self.parent = kind) \n\t\t\t\t\t\t\t\t\tthen\n\t\t\t\t\t\t\t\t\t\ttrue\n\t\t\t\t\t\t\t\t\telse\n\t\t\t\t\t\t\t\t\t\tself.parent.occiIsKindOf(kind)\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\telse\n\t\t\t\t\t\t\t\tfalse\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\tfalse\n\t\t\t\t\t\tendif'"
	 * @generated
	 */
	boolean occiIsKindOf(Kind kind);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='parent-&gt;closure(parent)-&gt;excludes(self)'"
	 * @generated
	 */
	boolean NoCyclicInheritance(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='attributes.name-&gt;excludesAll(parent-&gt;closure(parent).attributes.name)'"
	 * @generated
	 */
	boolean AttributesNameNotAlreadyDefinedInParent(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\t\t\t\tstatus: Boolean= \n\t\t\t\t\t\t\t\tif(self.source-&gt;size() &gt; 0)\n\t\t\t\t\t\t\t\tthen \n\t\t\t\t\t\t\t\t\tself-&gt;closure(parent)-&gt;exists(k |k.term = \'link\' and k.scheme = \'http://schemas.ogf.org/occi/core#\')\n\t\t\t\t\t\t\t\t\tand \n\t\t\t\t\t\t\t\t\tself.source-&gt;forAll(sourceKind|sourceKind-&gt;closure(parent)-&gt;exists(k |k.term = \'resource\' and k.scheme = \'http://schemas.ogf.org/occi/core#\'))\n\t\t\t\t\t\t\t\t else\n\t\t\t\t\t\t\t\t \ttrue \n\t\t\t\t\t\t\t\t endif,\n\t\t\t\tmessage: String =\'The source reference of \'+self.name +\' kind must connect a child of \"link\" Kind to a child of \"resource\" Kind\' ,\n\t\t\t\tseverity :Integer = -1,\n\t\t\t\tquickfix:String = \'quickfix\'\n\t\t\t}.status'"
	 * @generated
	 */
	boolean sourceReferenceInvariant(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='scheme = self.oclContainer().oclAsType(Extension).scheme'"
	 * @generated
	 */
	boolean CorrectScheme(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\t\t\t\tstatus: Boolean= \n\t\t\t\t\t\t\t\tif(self.target-&gt;size() &gt; 0)\n\t\t\t\t\t\t\t\tthen \n\t\t\t\t\t\t\t\t\tself-&gt;closure(parent)-&gt;exists(k |k.term = \'link\' and k.scheme = \'http://schemas.ogf.org/occi/core#\')\n\t\t\t\t\t\t\t\t\tand \n\t\t\t\t\t\t\t\t\tself.target-&gt;forAll(targetKind|targetKind-&gt;closure(parent)-&gt;exists(k |k.term = \'resource\' and k.scheme = \'http://schemas.ogf.org/occi/core#\'))\n\t\t\t\t\t\t\t\t else\n\t\t\t\t\t\t\t\t \ttrue \n\t\t\t\t\t\t\t\t endif,\n\t\t\t\tmessage: String =\'The target reference of \'+self.name +\' kind must connect a child of \"link\" Kind to a child of \"resource\" Kind\' ,\n\t\t\t\tseverity :Integer = -1,\n\t\t\t\tquickfix:String = \'quickfix\'\n\t\t\t}.status'"
	 * @generated
	 */
	boolean targetReferenceInvariant(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self-&gt;closure(parent)-&gt;exists(k |\n\t\t\t\t\tk.term = \'entity\' and k.scheme = \'http://schemas.ogf.org/occi/core#\' and k.parent = null)'"
	 * @generated
	 */
	boolean EntityKindIsRootParent(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Kind
