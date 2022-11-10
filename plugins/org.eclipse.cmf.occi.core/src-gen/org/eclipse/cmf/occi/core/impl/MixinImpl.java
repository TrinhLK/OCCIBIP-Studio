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
package org.eclipse.cmf.occi.core.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.cmf.occi.core.Attribute;
import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.Mixin;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.OCCIPackage;
import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.ocl.pivot.StandardLibrary;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.IdResolver.IdResolverExtension;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.internal.library.executor.ExecutorSingleIterationManager;
import org.eclipse.ocl.pivot.library.AbstractBinaryOperation;
import org.eclipse.ocl.pivot.library.LibraryIteration.LibraryIterationExtension;
import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;
import org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation;

import org.eclipse.ocl.pivot.library.collection.CollectionExcludesAllOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionExcludesOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation;

import org.eclipse.ocl.pivot.library.numeric.NumericMinusOperation;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringSizeOperation;
import org.eclipse.ocl.pivot.library.string.StringSubstringOperation;

import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.ocl.pivot.values.SetValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mixin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.core.impl.MixinImpl#getDepends <em>Depends</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.impl.MixinImpl#getApplies <em>Applies</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.impl.MixinImpl#getEntities <em>Entities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MixinImpl extends TypeImpl implements Mixin {
	/**
	 * The cached value of the '{@link #getDepends() <em>Depends</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepends()
	 * @generated
	 * @ordered
	 */
	protected EList<Mixin> depends;

	/**
	 * The cached value of the '{@link #getApplies() <em>Applies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplies()
	 * @generated
	 * @ordered
	 */
	protected EList<Kind> applies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MixinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCCIPackage.Literals.MIXIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Mixin> getDepends() {
		if (depends == null) {
			depends = new EObjectResolvingEList<Mixin>(Mixin.class, this, OCCIPackage.MIXIN__DEPENDS);
		}
		return depends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Kind> getApplies() {
		if (applies == null) {
			applies = new EObjectResolvingEList<Kind>(Kind.class, this, OCCIPackage.MIXIN__APPLIES);
		}
		return applies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
  @Override
	public EList<Entity> getEntities() {
		/**
		 *
		 * Entity.allInstances()
		 * ->select(parts.mixin->includes(self))
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_Entity_0 = idResolver.getClass(OCCITables.CLSSid_Entity, null);
		final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, OCCITables.SET_CLSSid_Entity, TYP_occi_c_c_Entity_0);
		/*@Thrown*/ Accumulator accumulator = ValueUtil.createSetAccumulatorValue(OCCITables.SET_CLSSid_Entity);
		Iterator<Object> ITERATOR__1_0 = allInstances.iterator();
		/*@NonInvalid*/ SetValue select;
		while (true) {
			if (!ITERATOR__1_0.hasNext()) {
				select = accumulator;
				break;
			}
			/*@NonInvalid*/ Entity _1_0 = (Entity)ITERATOR__1_0.next();
			/**
			 * parts.mixin->includes(self)
			 */
			final /*@NonInvalid*/ List<MixinBase> parts = _1_0.getParts();
			final /*@NonInvalid*/ OrderedSetValue BOXED_parts = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_MixinBase, parts);
			/*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue.Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_CLSSid_Mixin);
			Iterator<Object> ITERATOR__1 = BOXED_parts.iterator();
			/*@NonInvalid*/ SequenceValue collect;
			while (true) {
				if (!ITERATOR__1.hasNext()) {
					collect = accumulator_0;
					break;
				}
				/*@NonInvalid*/ MixinBase _1 = (MixinBase)ITERATOR__1.next();
				/**
				 * mixin
				 */
				final /*@NonInvalid*/ Mixin mixin = _1.getMixin();
				//
				accumulator_0.add(mixin);
			}
			final /*@NonInvalid*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(collect, this).booleanValue();
			//
			if (includes) {
				accumulator.add(_1_0);
			}
		}
		final /*@NonInvalid*/ List<Entity> ECORE_select = ((IdResolverExtension)idResolver).ecoreValueOfAll(Entity.class, select);
		return (EList<Entity>)ECORE_select;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean CorrectScheme(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Mixin::CorrectScheme";
		try {
			/**
			 *
			 * inv CorrectScheme:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = let owner : OclElement[?] = self.oclContainer()
			 *         in
			 *           if owner.oclIsTypeOf(Extension)
			 *           then
			 *             let
			 *               ownerScheme : Scheme[1] = owner.oclAsType(Extension).scheme
			 *             in
			 *               scheme.substring(1, ownerScheme.size() - 1) =
			 *               ownerScheme.substring(1, ownerScheme.size() - 1)
			 *           else true
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, OCCIPackage.Literals.MIXIN___CORRECT_SCHEME__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, OCCITables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_1;
			if (le) {
				local_1 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_local_0;
				try {
					final /*@NonInvalid*/ Object owner = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, this);
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_Extension_0 = idResolver.getClass(OCCITables.CLSSid_Extension, null);
					final /*@Thrown*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, owner, TYP_occi_c_c_Extension_0).booleanValue();
					/*@Thrown*/ boolean local_0;
					if (oclIsTypeOf) {
						final /*@Thrown*/ Extension oclAsType = (Extension)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, owner, TYP_occi_c_c_Extension_0);
						final /*@Thrown*/ String ownerScheme = oclAsType.getScheme();
						final /*@Thrown*/ IntegerValue size_0 = StringSizeOperation.INSTANCE.evaluate(ownerScheme);
						final /*@Thrown*/ IntegerValue diff_0 = (IntegerValue)NumericMinusOperation.INSTANCE.evaluate(size_0, OCCITables.INT_1);
						final /*@NonInvalid*/ String scheme = this.getScheme();
						if (diff_0 instanceof InvalidValueException) {
							throw (InvalidValueException)diff_0;
						}
						final /*@Thrown*/ String substring = StringSubstringOperation.INSTANCE.evaluate(scheme, OCCITables.INT_1, diff_0);
						if (diff_0 instanceof InvalidValueException) {
							throw (InvalidValueException)diff_0;
						}
						final /*@Thrown*/ String substring_0 = StringSubstringOperation.INSTANCE.evaluate(ownerScheme, OCCITables.INT_1, diff_0);
						final /*@Thrown*/ boolean eq = substring.equals(substring_0);
						local_0 = eq;
					}
					else {
						local_0 = true;
					}
					CAUGHT_local_0 = local_0;
				}
				catch (Exception e) {
					CAUGHT_local_0 = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_local_0, OCCITables.INT_0).booleanValue();
				local_1 = logDiagnostic;
			}
			return local_1;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean NoCyclicInheritance(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Mixin::NoCyclicInheritance";
		try {
			/**
			 *
			 * inv NoCyclicInheritance:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = depends->closure(depends)
			 *         ->excludes(self)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, OCCIPackage.Literals.MIXIN___NO_CYCLIC_INHERITANCE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, OCCITables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_1;
			if (le) {
				local_1 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Mixin> depends = this.getDepends();
					final /*@NonInvalid*/ OrderedSetValue BOXED_depends = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Mixin, depends);
					final org.eclipse.ocl.pivot.Class TYPE_closure_0 = executor.getStaticTypeOfValue(null, BOXED_depends);
					final LibraryIterationExtension IMPL_closure_0 = (LibraryIterationExtension)TYPE_closure_0.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._OrderedSet__closure);
					final /*@NonNull*/ Object ACC_closure_0 = IMPL_closure_0.createAccumulatorValue(executor, OCCITables.ORD_CLSSid_Mixin, OCCITables.ORD_CLSSid_Mixin);
					/**
					 * Implementation of the iterator body.
					 */
					final AbstractBinaryOperation BODY_closure_0 = new AbstractBinaryOperation() {
						/**
						 * depends
						 */
						@Override
						public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId, final /*@Nullable*/ Object BOXED_depends, final /*@NonInvalid*/ Object _1) {
							final /*@NonInvalid*/ Mixin local_0 = (Mixin)_1;
							if (local_0 == null) {
								throw new InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi/core/ecore\'::Mixin::depends\'");
							}
							final /*@Thrown*/ List<Mixin> depends_0 = local_0.getDepends();
							final /*@Thrown*/ OrderedSetValue BOXED_depends_0 = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Mixin, depends_0);
							return BOXED_depends_0;
						}
					};
					final ExecutorSingleIterationManager MGR_closure_0 = new ExecutorSingleIterationManager(executor, OCCITables.ORD_CLSSid_Mixin, BODY_closure_0, BOXED_depends, ACC_closure_0);
					final /*@Thrown*/ OrderedSetValue closure = (OrderedSetValue)IMPL_closure_0.evaluateIteration(MGR_closure_0);
					final /*@Thrown*/ boolean result = CollectionExcludesOperation.INSTANCE.evaluate(closure, this).booleanValue();
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, OCCITables.INT_0).booleanValue();
				local_1 = logDiagnostic;
			}
			return local_1;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean AttributesNameNotAlreadyDefinedInDepends(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Mixin::AttributesNameNotAlreadyDefinedInDepends";
		try {
			/**
			 *
			 * inv AttributesNameNotAlreadyDefinedInDepends:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = attributes.name->excludesAll(
			 *           depends->closure(depends).attributes.name)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, OCCIPackage.Literals.MIXIN___ATTRIBUTES_NAME_NOT_ALREADY_DEFINED_IN_DEPENDS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, OCCITables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_1;
			if (le) {
				local_1 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Attribute> attributes = this.getAttributes();
					final /*@NonInvalid*/ OrderedSetValue BOXED_attributes = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Attribute, attributes);
					/*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue.Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_DATAid_AttributeName);
					Iterator<Object> ITERATOR__1 = BOXED_attributes.iterator();
					/*@NonInvalid*/ SequenceValue collect;
					while (true) {
						if (!ITERATOR__1.hasNext()) {
							collect = accumulator;
							break;
						}
						/*@NonInvalid*/ Attribute _1 = (Attribute)ITERATOR__1.next();
						/**
						 * name
						 */
						final /*@NonInvalid*/ String name = _1.getName();
						//
						accumulator.add(name);
					}
					final /*@NonInvalid*/ List<Mixin> depends = this.getDepends();
					final /*@NonInvalid*/ OrderedSetValue BOXED_depends = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Mixin, depends);
					final org.eclipse.ocl.pivot.Class TYPE_closure_0 = executor.getStaticTypeOfValue(null, BOXED_depends);
					final LibraryIterationExtension IMPL_closure_0 = (LibraryIterationExtension)TYPE_closure_0.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._OrderedSet__closure);
					final /*@NonNull*/ Object ACC_closure_0 = IMPL_closure_0.createAccumulatorValue(executor, OCCITables.ORD_CLSSid_Mixin, OCCITables.ORD_CLSSid_Mixin);
					/**
					 * Implementation of the iterator body.
					 */
					final AbstractBinaryOperation BODY_closure_0 = new AbstractBinaryOperation() {
						/**
						 * depends
						 */
						@Override
						public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId, final /*@Nullable*/ Object BOXED_depends, final /*@NonInvalid*/ Object _1_0) {
							final /*@NonInvalid*/ Mixin local_0 = (Mixin)_1_0;
							if (local_0 == null) {
								throw new InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi/core/ecore\'::Mixin::depends\'");
							}
							final /*@Thrown*/ List<Mixin> depends_0 = local_0.getDepends();
							final /*@Thrown*/ OrderedSetValue BOXED_depends_0 = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Mixin, depends_0);
							return BOXED_depends_0;
						}
					};
					final ExecutorSingleIterationManager MGR_closure_0 = new ExecutorSingleIterationManager(executor, OCCITables.ORD_CLSSid_Mixin, BODY_closure_0, BOXED_depends, ACC_closure_0);
					final /*@Thrown*/ OrderedSetValue closure = (OrderedSetValue)IMPL_closure_0.evaluateIteration(MGR_closure_0);
					/*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue.Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_CLSSid_Attribute);
					Iterator<Object> ITERATOR__1_1 = closure.iterator();
					/*@Thrown*/ SequenceValue collect_1;
					while (true) {
						if (!ITERATOR__1_1.hasNext()) {
							collect_1 = accumulator_0;
							break;
						}
						/*@NonInvalid*/ Mixin _1_1 = (Mixin)ITERATOR__1_1.next();
						/**
						 * attributes
						 */
						final /*@NonInvalid*/ List<Attribute> attributes_0 = _1_1.getAttributes();
						final /*@NonInvalid*/ OrderedSetValue BOXED_attributes_0 = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Attribute, attributes_0);
						//
						for (Object value : BOXED_attributes_0.flatten().getElements()) {
							accumulator_0.add(value);
						}
					}
					/*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue.Accumulator accumulator_1 = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_DATAid_AttributeName);
					Iterator<Object> ITERATOR__1_2 = collect_1.iterator();
					/*@Thrown*/ SequenceValue collect_0;
					while (true) {
						if (!ITERATOR__1_2.hasNext()) {
							collect_0 = accumulator_1;
							break;
						}
						/*@NonInvalid*/ Attribute _1_2 = (Attribute)ITERATOR__1_2.next();
						/**
						 * name
						 */
						final /*@NonInvalid*/ String name_0 = _1_2.getName();
						//
						accumulator_1.add(name_0);
					}
					if (collect_0 instanceof InvalidValueException) {
						throw (InvalidValueException)collect_0;
					}
					final /*@Thrown*/ boolean result = CollectionExcludesAllOperation.INSTANCE.evaluate(collect, collect_0).booleanValue();
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, OCCITables.INT_0).booleanValue();
				local_1 = logDiagnostic;
			}
			return local_1;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OCCIPackage.MIXIN__DEPENDS:
				return getDepends();
			case OCCIPackage.MIXIN__APPLIES:
				return getApplies();
			case OCCIPackage.MIXIN__ENTITIES:
				return getEntities();
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
			case OCCIPackage.MIXIN__DEPENDS:
				getDepends().clear();
				getDepends().addAll((Collection<? extends Mixin>)newValue);
				return;
			case OCCIPackage.MIXIN__APPLIES:
				getApplies().clear();
				getApplies().addAll((Collection<? extends Kind>)newValue);
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
			case OCCIPackage.MIXIN__DEPENDS:
				getDepends().clear();
				return;
			case OCCIPackage.MIXIN__APPLIES:
				getApplies().clear();
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
			case OCCIPackage.MIXIN__DEPENDS:
				return depends != null && !depends.isEmpty();
			case OCCIPackage.MIXIN__APPLIES:
				return applies != null && !applies.isEmpty();
			case OCCIPackage.MIXIN__ENTITIES:
				return !getEntities().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OCCIPackage.MIXIN___CORRECT_SCHEME__DIAGNOSTICCHAIN_MAP:
				return CorrectScheme((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case OCCIPackage.MIXIN___NO_CYCLIC_INHERITANCE__DIAGNOSTICCHAIN_MAP:
				return NoCyclicInheritance((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case OCCIPackage.MIXIN___ATTRIBUTES_NAME_NOT_ALREADY_DEFINED_IN_DEPENDS__DIAGNOSTICCHAIN_MAP:
				return AttributesNameNotAlreadyDefinedInDepends((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //MixinImpl
