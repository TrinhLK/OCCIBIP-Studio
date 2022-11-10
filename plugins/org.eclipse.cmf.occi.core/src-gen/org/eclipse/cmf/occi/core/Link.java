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
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.core.Link#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Link#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.core.OCCIPackage#getLink()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='LinkKindIsInParent'"
 * @generated
 */
public interface Link extends Entity {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.cmf.occi.core.Resource#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see #setSource(Resource)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getLink_Source()
	 * @see org.eclipse.cmf.occi.core.Resource#getLinks
	 * @model opposite="links" required="true" transient="false"
	 * @generated
	 */
	Resource getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.Link#getSource <em>Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' container reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Resource value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.cmf.occi.core.Resource#getRlinks <em>Rlinks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Resource)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getLink_Target()
	 * @see org.eclipse.cmf.occi.core.Resource#getRlinks
	 * @model opposite="rlinks" required="true"
	 * @generated
	 */
	Resource getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.Link#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Resource value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.cmf.occi.core.Boolean" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\t\n\t\t\t\t\t\t/* if target or source of the kind of this link instance exists \052/\n\t\t\t\t\t\tif (linkInstanceKind.target-&gt;size() &gt; 0)\n\t\t\t\t\t\tthen\n\t\t\t\t\t\t\tlinkInstanceKind.target-&gt;exists (aTarget |resourcekind.occiIsKindOf(aTarget))\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\tif(linkInstanceKind.parent &lt;&gt; null)\n\t\t\t\t\t\t\tthen\n\t\t\t\t\t\t\t\tLinkTargetInvariant(resourcekind, linkInstanceKind.parent)\n\t\t\t\t\t\t\telse\n\t\t\t\t\t\t\t\ttrue\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\tendif'"
	 * @generated
	 */
	boolean LinkTargetInvariant(Kind resourcekind, Kind linkInstanceKind);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.cmf.occi.core.Boolean" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\t\n\t\t\t\t\t\t/* if target or source of the kind of this link instance exists \052/\n\t\t\t\t\t\tif (linkInstanceKind.source-&gt;size() &gt; 0)\n\t\t\t\t\t\tthen\n\t\t\t\t\t\t\tlinkInstanceKind.source-&gt;exists (aSource|resourcekind.occiIsKindOf(aSource))\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\tif(linkInstanceKind.parent &lt;&gt; null)\n\t\t\t\t\t\t\tthen\n\t\t\t\t\t\t\t\tLinkSourceInvariant(resourcekind, linkInstanceKind.parent)\n\t\t\t\t\t\t\telse\n\t\t\t\t\t\t\t\ttrue\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\tendif'"
	 * @generated
	 */
	boolean LinkSourceInvariant(Kind resourcekind, Kind linkInstanceKind);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\t\t\t\tstatus: Boolean= LinkSourceInvariant(self.source.kind,self.oclAsType(Entity).kind),\n\t\t\t\tmessage: String =\'The kind of the source reference in the link instance \'+self.oclAsType(Entity).title+\' must be a kind of the source of the kind of this link\' ,\n\t\t\t\tseverity: Integer = -1,\n\t\t\t\tquickfix: String = \'quickfix\'\n\t\t\t}.status'"
	 * @generated
	 */
	boolean sourceReferenceInvariant(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\t\t\t\tstatus: Boolean= LinkTargetInvariant(self.target.kind,self.oclAsType(Entity).kind),\n\t\t\t\tmessage: String =\'The kind of the target reference in the link instance \'+self.oclAsType(Entity).title+\' must be a kind of the target of the kind of this link\' ,\n\t\t\t\tseverity: Integer = -1,\n\t\t\t\tquickfix: String = \'quickfix\'\n\t\t\t}.status'"
	 * @generated
	 */
	boolean targetReferenceInvariant(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='kind-&gt;closure(parent)-&gt;exists(k |\n\t\t\t\tk.term = \'link\' and k.scheme = \'http://schemas.ogf.org/occi/core#\')'"
	 * @generated
	 */
	boolean LinkKindIsInParent(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Link
