/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.fir.test.cases.generated.cases.symbols;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.analysis.api.fir.test.configurators.AnalysisApiFirTestConfiguratorFactory;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfiguratorFactoryData;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfigurator;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.TestModuleKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.FrontendKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisSessionMode;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiMode;
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.symbols.AbstractSymbolByPsiTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/symbols/symbolByPsi")
@TestDataPath("$PROJECT_ROOT")
public class FirIdeNormalAnalysisSourceModuleSymbolByPsiTestGenerated extends AbstractSymbolByPsiTest {
  @NotNull
  @Override
  public AnalysisApiTestConfigurator getConfigurator() {
    return AnalysisApiFirTestConfiguratorFactory.INSTANCE.createConfigurator(
      new AnalysisApiTestConfiguratorFactoryData(
        FrontendKind.Fir,
        TestModuleKind.Source,
        AnalysisSessionMode.Normal,
        AnalysisApiMode.Ide
      )
    );
  }

  @Test
  public void testAllFilesPresentInSymbolByPsi() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/symbols/symbolByPsi"), Pattern.compile("^(.+)\\.kt$"), null, true);
  }

  @Test
  @TestMetadata("annotations.kt")
  public void testAnnotations() {
    runTest("analysis/analysis-api/testData/symbols/symbolByPsi/annotations.kt");
  }

  @Test
  @TestMetadata("anonymousObject.kt")
  public void testAnonymousObject() {
    runTest("analysis/analysis-api/testData/symbols/symbolByPsi/anonymousObject.kt");
  }

  @Test
  @TestMetadata("backingField.kt")
  public void testBackingField() {
    runTest("analysis/analysis-api/testData/symbols/symbolByPsi/backingField.kt");
  }

  @Test
  @TestMetadata("class.kt")
  public void testClass() {
    runTest("analysis/analysis-api/testData/symbols/symbolByPsi/class.kt");
  }

  @Test
  @TestMetadata("classInitializer.kt")
  public void testClassInitializer() {
    runTest("analysis/analysis-api/testData/symbols/symbolByPsi/classInitializer.kt");
  }

  @Test
  @TestMetadata("classMembes.kt")
  public void testClassMembes() {
    runTest("analysis/analysis-api/testData/symbols/symbolByPsi/classMembes.kt");
  }

  @Test
  @TestMetadata("classPrimaryConstructor.kt")
  public void testClassPrimaryConstructor() {
    runTest("analysis/analysis-api/testData/symbols/symbolByPsi/classPrimaryConstructor.kt");
  }

  @Test
  @TestMetadata("classSecondaryConstructors.kt")
  public void testClassSecondaryConstructors() {
    runTest("analysis/analysis-api/testData/symbols/symbolByPsi/classSecondaryConstructors.kt");
  }

  @Test
  @TestMetadata("classWithTypeParams.kt")
  public void testClassWithTypeParams() {
    runTest("analysis/analysis-api/testData/symbols/symbolByPsi/classWithTypeParams.kt");
  }

  @Test
  @TestMetadata("delegateField.kt")
  public void testDelegateField() {
    runTest("analysis/analysis-api/testData/symbols/symbolByPsi/delegateField.kt");
  }

  @Test
  @TestMetadata("delegatedProp.kt")
  public void testDelegatedProp() {
    runTest("analysis/analysis-api/testData/symbols/symbolByPsi/delegatedProp.kt");
  }

  @Test
  @TestMetadata("deprecated.kt")
  public void testDeprecated() {
    runTest("analysis/analysis-api/testData/symbols/symbolByPsi/deprecated.kt");
  }

  @Test
  @TestMetadata("destructuringDeclaration.kt")
  public void testDestructuringDeclaration() {
    runTest("analysis/analysis-api/testData/symbols/symbolByPsi/destructuringDeclaration.kt");
  }

  @Test
  @TestMetadata("dynamic.kt")
  public void testDynamic() {
    runTest("analysis/analysis-api/testData/symbols/symbolByPsi/dynamic.kt");
  }

  @Test
  @TestMetadata("enum.kt")
  public void testEnum() {
    runTest("analysis/analysis-api/testData/symbols/symbolByPsi/enum.kt");
  }

  @Test
  @TestMetadata("enumEntryFunctions.kt")
  public void testEnumEntryFunctions() {
    runTest("analysis/analysis-api/testData/symbols/symbolByPsi/enumEntryFunctions.kt");
  }

  @Test
  @TestMetadata("enumEntryOverride.kt")
  public void testEnumEntryOverride() {
    runTest("analysis/analysis-api/testData/symbols/symbolByPsi/enumEntryOverride.kt");
  }

  @Test
  @TestMetadata("enumEntryProperties.kt")
  public void testEnumEntryProperties() {
    runTest("analysis/analysis-api/testData/symbols/symbolByPsi/enumEntryProperties.kt");
  }

  @Test
  @TestMetadata("enumValueMember.kt")
  public void testEnumValueMember() {
    runTest("analysis/analysis-api/testData/symbols/symbolByPsi/enumValueMember.kt");
  }

  @Test
  @TestMetadata("explicitBackingField.kt")
  public void testExplicitBackingField() {
    runTest("analysis/analysis-api/testData/symbols/symbolByPsi/explicitBackingField.kt");
  }

  @Test
  @TestMetadata("extensionFunction.kt")
  public void testExtensionFunction() {
    runTest("analysis/analysis-api/testData/symbols/symbolByPsi/extensionFunction.kt");
  }

  @Test
  @TestMetadata("facadeWithJvmName.kt")
  public void testFacadeWithJvmName() {
    runTest("analysis/analysis-api/testData/symbols/symbolByPsi/facadeWithJvmName.kt");
  }

  @Test
  @TestMetadata("forLoopVariable.kt")
  public void testForLoopVariable() {
    runTest("analysis/analysis-api/testData/symbols/symbolByPsi/forLoopVariable.kt");
  }

  @Test
  @TestMetadata("function.kt")
  public void testFunction() {
    runTest("analysis/analysis-api/testData/symbols/symbolByPsi/function.kt");
  }

  @Test
  @TestMetadata("functionWithTypeAlias.kt")
  public void testFunctionWithTypeAlias() {
    runTest("analysis/analysis-api/testData/symbols/symbolByPsi/functionWithTypeAlias.kt");
  }

  @Test
  @TestMetadata("functionWithTypeParams.kt")
  public void testFunctionWithTypeParams() {
    runTest("analysis/analysis-api/testData/symbols/symbolByPsi/functionWithTypeParams.kt");
  }

  @Test
  @TestMetadata("functionsFromCompanion.kt")
  public void testFunctionsFromCompanion() {
    runTest("analysis/analysis-api/testData/symbols/symbolByPsi/functionsFromCompanion.kt");
  }

  @Test
  @TestMetadata("implicitConstructorDelegationCall.kt")
  public void testImplicitConstructorDelegationCall() {
    runTest("analysis/analysis-api/testData/symbols/symbolByPsi/implicitConstructorDelegationCall.kt");
  }

  @Test
  @TestMetadata("implicitReturn.kt")
  public void testImplicitReturn() {
    runTest("analysis/analysis-api/testData/symbols/symbolByPsi/implicitReturn.kt");
  }

  @Test
  @TestMetadata("implicitReturnInLambda.kt")
  public void testImplicitReturnInLambda() {
    runTest("analysis/analysis-api/testData/symbols/symbolByPsi/implicitReturnInLambda.kt");
  }

  @Test
  @TestMetadata("jvmField.kt")
  public void testJvmField() {
    runTest("analysis/analysis-api/testData/symbols/symbolByPsi/jvmField.kt");
  }

  @Test
  @TestMetadata("jvmName.kt")
  public void testJvmName() {
    runTest("analysis/analysis-api/testData/symbols/symbolByPsi/jvmName.kt");
  }

  @Test
  @TestMetadata("localDeclarations.kt")
  public void testLocalDeclarations() {
    runTest("analysis/analysis-api/testData/symbols/symbolByPsi/localDeclarations.kt");
  }

  @Test
  @TestMetadata("memberFunctions.kt")
  public void testMemberFunctions() {
    runTest("analysis/analysis-api/testData/symbols/symbolByPsi/memberFunctions.kt");
  }

  @Test
  @TestMetadata("memberProperties.kt")
  public void testMemberProperties() {
    runTest("analysis/analysis-api/testData/symbols/symbolByPsi/memberProperties.kt");
  }

  @Test
  @TestMetadata("multifilePart.kt")
  public void testMultifilePart() {
    runTest("analysis/analysis-api/testData/symbols/symbolByPsi/multifilePart.kt");
  }

  @Test
  @TestMetadata("outerAndInnerClasses.kt")
  public void testOuterAndInnerClasses() {
    runTest("analysis/analysis-api/testData/symbols/symbolByPsi/outerAndInnerClasses.kt");
  }

  @Test
  @TestMetadata("outerAndInnerTypeAlias.kt")
  public void testOuterAndInnerTypeAlias() {
    runTest("analysis/analysis-api/testData/symbols/symbolByPsi/outerAndInnerTypeAlias.kt");
  }

  @Test
  @TestMetadata("propertiesFromCompanion.kt")
  public void testPropertiesFromCompanion() {
    runTest("analysis/analysis-api/testData/symbols/symbolByPsi/propertiesFromCompanion.kt");
  }

  @Test
  @TestMetadata("similarGenericSignature.kt")
  public void testSimilarGenericSignature() {
    runTest("analysis/analysis-api/testData/symbols/symbolByPsi/similarGenericSignature.kt");
  }

  @Test
  @TestMetadata("topLevelFunctions.kt")
  public void testTopLevelFunctions() {
    runTest("analysis/analysis-api/testData/symbols/symbolByPsi/topLevelFunctions.kt");
  }

  @Test
  @TestMetadata("topLevelProperties.kt")
  public void testTopLevelProperties() {
    runTest("analysis/analysis-api/testData/symbols/symbolByPsi/topLevelProperties.kt");
  }

  @Test
  @TestMetadata("typeAlias.kt")
  public void testTypeAlias() {
    runTest("analysis/analysis-api/testData/symbols/symbolByPsi/typeAlias.kt");
  }

  @Test
  @TestMetadata("typeAnnotations.kt")
  public void testTypeAnnotations() {
    runTest("analysis/analysis-api/testData/symbols/symbolByPsi/typeAnnotations.kt");
  }

  @Test
  @TestMetadata("typeParameters.kt")
  public void testTypeParameters() {
    runTest("analysis/analysis-api/testData/symbols/symbolByPsi/typeParameters.kt");
  }

  @Test
  @TestMetadata("typeParametersStressTest.kt")
  public void testTypeParametersStressTest() {
    runTest("analysis/analysis-api/testData/symbols/symbolByPsi/typeParametersStressTest.kt");
  }

  @Test
  @TestMetadata("varargFunctions.kt")
  public void testVarargFunctions() {
    runTest("analysis/analysis-api/testData/symbols/symbolByPsi/varargFunctions.kt");
  }

  @Nested
  @TestMetadata("analysis/analysis-api/testData/symbols/symbolByPsi/contextReceivers")
  @TestDataPath("$PROJECT_ROOT")
  public class ContextReceivers {
    @Test
    public void testAllFilesPresentInContextReceivers() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/symbols/symbolByPsi/contextReceivers"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("contextReceiversOnClass.kt")
    public void testContextReceiversOnClass() {
      runTest("analysis/analysis-api/testData/symbols/symbolByPsi/contextReceivers/contextReceiversOnClass.kt");
    }

    @Test
    @TestMetadata("contextReceiversOnFunction.kt")
    public void testContextReceiversOnFunction() {
      runTest("analysis/analysis-api/testData/symbols/symbolByPsi/contextReceivers/contextReceiversOnFunction.kt");
    }

    @Test
    @TestMetadata("contextReceiversOnProperty.kt")
    public void testContextReceiversOnProperty() {
      runTest("analysis/analysis-api/testData/symbols/symbolByPsi/contextReceivers/contextReceiversOnProperty.kt");
    }

    @Test
    @TestMetadata("similarSignatures.kt")
    public void testSimilarSignatures() {
      runTest("analysis/analysis-api/testData/symbols/symbolByPsi/contextReceivers/similarSignatures.kt");
    }
  }

  @Nested
  @TestMetadata("analysis/analysis-api/testData/symbols/symbolByPsi/valueParameters")
  @TestDataPath("$PROJECT_ROOT")
  public class ValueParameters {
    @Test
    public void testAllFilesPresentInValueParameters() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/symbols/symbolByPsi/valueParameters"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("parameterInlining.kt")
    public void testParameterInlining() {
      runTest("analysis/analysis-api/testData/symbols/symbolByPsi/valueParameters/parameterInlining.kt");
    }

    @Test
    @TestMetadata("parameterNotFunctionalType.kt")
    public void testParameterNotFunctionalType() {
      runTest("analysis/analysis-api/testData/symbols/symbolByPsi/valueParameters/parameterNotFunctionalType.kt");
    }

    @Test
    @TestMetadata("vararg.kt")
    public void testVararg() {
      runTest("analysis/analysis-api/testData/symbols/symbolByPsi/valueParameters/vararg.kt");
    }

    @Test
    @TestMetadata("varargInAnnotationPrimaryConstructor.kt")
    public void testVarargInAnnotationPrimaryConstructor() {
      runTest("analysis/analysis-api/testData/symbols/symbolByPsi/valueParameters/varargInAnnotationPrimaryConstructor.kt");
    }

    @Test
    @TestMetadata("varargInAnnotationPrimaryConstructorAsProperty.kt")
    public void testVarargInAnnotationPrimaryConstructorAsProperty() {
      runTest("analysis/analysis-api/testData/symbols/symbolByPsi/valueParameters/varargInAnnotationPrimaryConstructorAsProperty.kt");
    }

    @Test
    @TestMetadata("varargInAnnotationPrimaryConstructorAsPropertyWithoutType.kt")
    public void testVarargInAnnotationPrimaryConstructorAsPropertyWithoutType() {
      runTest("analysis/analysis-api/testData/symbols/symbolByPsi/valueParameters/varargInAnnotationPrimaryConstructorAsPropertyWithoutType.kt");
    }

    @Test
    @TestMetadata("varargInAnnotationPrimaryConstructorWithoutType.kt")
    public void testVarargInAnnotationPrimaryConstructorWithoutType() {
      runTest("analysis/analysis-api/testData/symbols/symbolByPsi/valueParameters/varargInAnnotationPrimaryConstructorWithoutType.kt");
    }

    @Test
    @TestMetadata("varargInPrimaryConstructor.kt")
    public void testVarargInPrimaryConstructor() {
      runTest("analysis/analysis-api/testData/symbols/symbolByPsi/valueParameters/varargInPrimaryConstructor.kt");
    }

    @Test
    @TestMetadata("varargInPrimaryConstructorAsProperty.kt")
    public void testVarargInPrimaryConstructorAsProperty() {
      runTest("analysis/analysis-api/testData/symbols/symbolByPsi/valueParameters/varargInPrimaryConstructorAsProperty.kt");
    }

    @Test
    @TestMetadata("varargInPrimaryConstructorAsPropertyWithoutType.kt")
    public void testVarargInPrimaryConstructorAsPropertyWithoutType() {
      runTest("analysis/analysis-api/testData/symbols/symbolByPsi/valueParameters/varargInPrimaryConstructorAsPropertyWithoutType.kt");
    }

    @Test
    @TestMetadata("varargInPrimaryConstructorAsPropertyWithoutType2.kt")
    public void testVarargInPrimaryConstructorAsPropertyWithoutType2() {
      runTest("analysis/analysis-api/testData/symbols/symbolByPsi/valueParameters/varargInPrimaryConstructorAsPropertyWithoutType2.kt");
    }

    @Test
    @TestMetadata("varargInPrimaryConstructorWithoutType.kt")
    public void testVarargInPrimaryConstructorWithoutType() {
      runTest("analysis/analysis-api/testData/symbols/symbolByPsi/valueParameters/varargInPrimaryConstructorWithoutType.kt");
    }

    @Test
    @TestMetadata("varargInSecondaryConstructor.kt")
    public void testVarargInSecondaryConstructor() {
      runTest("analysis/analysis-api/testData/symbols/symbolByPsi/valueParameters/varargInSecondaryConstructor.kt");
    }

    @Test
    @TestMetadata("varargInSecondaryConstructorWithoutType.kt")
    public void testVarargInSecondaryConstructorWithoutType() {
      runTest("analysis/analysis-api/testData/symbols/symbolByPsi/valueParameters/varargInSecondaryConstructorWithoutType.kt");
    }

    @Test
    @TestMetadata("varargWithoutType.kt")
    public void testVarargWithoutType() {
      runTest("analysis/analysis-api/testData/symbols/symbolByPsi/valueParameters/varargWithoutType.kt");
    }
  }
}
