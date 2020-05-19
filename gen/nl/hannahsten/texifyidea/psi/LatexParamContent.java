// This is a generated file. Not intended for manual editing.
package nl.hannahsten.texifyidea.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface LatexParamContent extends PsiElement {

  @Nullable
  LatexCommands getCommands();

  @Nullable
  LatexComment getComment();

  @Nullable
  LatexEnvironment getEnvironment();

  @Nullable
  LatexGroup getGroup();

  @Nullable
  LatexMathEnvironment getMathEnvironment();

  @Nullable
  LatexOptionalParam getOptionalParam();

  @Nullable
  LatexParameterText getParameterText();

  @Nullable
  LatexPseudocodeBlock getPseudocodeBlock();

  @Nullable
  LatexRawText getRawText();

  @Nullable
  PsiElement getCommandIfnextchar();

}