/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package nl.hannahsten.texifyidea.grammar;

import java.util.*;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import nl.hannahsten.texifyidea.util.Magic;

import static nl.hannahsten.texifyidea.psi.LatexTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>LatexLexer.flex</tt>
 */
public class LatexLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int INLINE_MATH = 2;
  public static final int INLINE_MATH_LATEX = 4;
  public static final int DISPLAY_MATH = 6;
  public static final int TEXT_INSIDE_INLINE_MATH = 8;
  public static final int NESTED_INLINE_MATH = 10;
  public static final int PREAMBLE_OPTION = 12;
  public static final int NEW_ENVIRONMENT_DEFINITION_NAME = 14;
  public static final int NEW_ENVIRONMENT_DEFINITION = 16;
  public static final int NEW_ENVIRONMENT_SKIP_BRACE = 18;
  public static final int NEW_ENVIRONMENT_DEFINITION_END = 20;
  public static final int INLINE_VERBATIM_START = 22;
  public static final int INLINE_VERBATIM_PIPE = 24;
  public static final int INLINE_VERBATIM_EXCL_MARK = 26;
  public static final int INLINE_VERBATIM_QUOTES = 28;
  public static final int INLINE_VERBATIM_EQUALS = 30;
  public static final int POSSIBLE_VERBATIM_BEGIN = 32;
  public static final int VERBATIM_OPTIONAL_ARG = 34;
  public static final int VERBATIM_START = 36;
  public static final int VERBATIM_END = 38;
  public static final int VERBATIM = 40;
  public static final int POSSIBLE_VERBATIM_OPTIONAL_ARG = 42;
  public static final int POSSIBLE_VERBATIM_END = 44;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int[] ZZ_LEXSTATE = {
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7,  7, 
     8,  8,  9,  9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 
    16, 16, 17, 17, 18, 18, 19, 19, 20, 20, 21, 21, 22, 22
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [7, 7, 7]
   * Total runtime size is 1928 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>14]|((ch>>7)&0x7f)]<<7)|(ch&0x7f)];
  }

  /* The ZZ_CMAP_Z table has 68 entries */
  static final char[] ZZ_CMAP_Z = zzUnpackCMap(
    "\1\0\103\200");

  /* The ZZ_CMAP_Y table has 256 entries */
  static final char[] ZZ_CMAP_Y = zzUnpackCMap(
    "\1\0\1\1\53\2\1\3\22\2\1\4\37\2\1\3\237\2");

  /* The ZZ_CMAP_A table has 640 entries */
  static final char[] ZZ_CMAP_A = zzUnpackCMap(
    "\11\0\1\10\1\20\2\22\1\21\22\0\1\10\1\60\1\61\1\0\1\65\1\34\1\36\1\0\1\2\1"+
    "\3\1\56\21\0\1\66\1\62\1\66\1\0\1\24\1\41\3\17\1\52\1\37\2\17\1\43\2\17\1"+
    "\47\3\17\1\51\1\17\1\45\2\17\1\54\1\17\1\44\3\17\1\4\1\1\1\5\3\0\1\32\1\11"+
    "\1\30\1\16\1\12\1\25\1\13\1\31\1\14\2\17\1\42\1\64\1\15\1\40\1\46\1\17\1\33"+
    "\1\53\1\27\1\50\1\55\1\63\1\26\2\17\1\6\1\57\1\7\7\0\1\23\32\0\1\35\337\0"+
    "\1\35\177\0\13\35\35\0\2\23\5\0\1\35\57\0\1\35\40\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\27\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\2\11\1\2\1\12\1\2\1\13\1\14\1\15"+
    "\1\16\1\2\1\17\1\20\1\21\3\2\1\22\1\23"+
    "\1\1\1\24\1\2\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\1\35\1\22\1\36\1\37\1\40"+
    "\1\41\1\35\1\42\1\43\1\44\1\45\1\46\1\7"+
    "\2\1\1\47\1\50\1\51\4\47\1\11\15\47\1\0"+
    "\2\12\1\47\1\21\1\52\1\53\1\54\2\36\1\0"+
    "\1\55\10\47\1\56\10\47\1\55\1\47\1\0\1\47"+
    "\1\57\2\47\1\56\13\47\1\60\16\47\1\61\2\47"+
    "\1\62\1\63\1\64\11\47\1\65\3\47\1\62\30\47"+
    "\1\62\11\47\1\66\1\47\1\67";

  private static int [] zzUnpackAction() {
    int [] result = new int[216];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\67\0\156\0\245\0\334\0\u0113\0\u014a\0\u0181"+
    "\0\u01b8\0\u01ef\0\u0226\0\u025d\0\u0294\0\u02cb\0\u0302\0\u0339"+
    "\0\u0370\0\u03a7\0\u03de\0\u0415\0\u044c\0\u0483\0\u04ba\0\u04f1"+
    "\0\u0528\0\u055f\0\u055f\0\u055f\0\u055f\0\u055f\0\u055f\0\u0596"+
    "\0\u05cd\0\u0604\0\u063b\0\u055f\0\u055f\0\u04f1\0\u055f\0\u055f"+
    "\0\u0672\0\u055f\0\u055f\0\u055f\0\u06a9\0\u06e0\0\u0717\0\u055f"+
    "\0\u055f\0\u055f\0\u055f\0\u074e\0\u055f\0\u055f\0\u055f\0\u055f"+
    "\0\u055f\0\u055f\0\u055f\0\u055f\0\u0604\0\u0604\0\u0785\0\u055f"+
    "\0\u055f\0\u055f\0\u07bc\0\u0604\0\u0604\0\u07f3\0\u082a\0\u0604"+
    "\0\u0604\0\u0861\0\u0898\0\u0604\0\u0604\0\u0604\0\u08cf\0\u0906"+
    "\0\u093d\0\u0974\0\u0604\0\u09ab\0\u09e2\0\u0a19\0\u0a50\0\u0a87"+
    "\0\u0abe\0\u0af5\0\u0b2c\0\u0b63\0\u0b9a\0\u0bd1\0\u0c08\0\u0c3f"+
    "\0\u0c3f\0\u0c76\0\u0cad\0\u0ce4\0\u0604\0\u0604\0\u0604\0\u0604"+
    "\0\u0d1b\0\u0d52\0\u0d89\0\u0604\0\u0dc0\0\u0df7\0\u0e2e\0\u0e65"+
    "\0\u0e9c\0\u0ed3\0\u0f0a\0\u0f41\0\u093d\0\u0f78\0\u0faf\0\u0fe6"+
    "\0\u101d\0\u1054\0\u108b\0\u10c2\0\u10f9\0\u0c76\0\u1130\0\u1167"+
    "\0\u119e\0\u093d\0\u11d5\0\u120c\0\u1243\0\u127a\0\u12b1\0\u12e8"+
    "\0\u131f\0\u1356\0\u138d\0\u13c4\0\u13fb\0\u1432\0\u1469\0\u14a0"+
    "\0\u0604\0\u14d7\0\u150e\0\u1545\0\u157c\0\u15b3\0\u15ea\0\u1621"+
    "\0\u1658\0\u168f\0\u16c6\0\u16fd\0\u1734\0\u176b\0\u17a2\0\u093d"+
    "\0\u17d9\0\u1810\0\u1847\0\u093d\0\u093d\0\u187e\0\u18b5\0\u18ec"+
    "\0\u1923\0\u195a\0\u1991\0\u19c8\0\u19ff\0\u1a36\0\u093d\0\u1a6d"+
    "\0\u1aa4\0\u1adb\0\u0604\0\u1b12\0\u1b49\0\u1b80\0\u1bb7\0\u1bee"+
    "\0\u1c25\0\u1c5c\0\u1c93\0\u1cca\0\u1d01\0\u1d38\0\u1d6f\0\u1da6"+
    "\0\u1ddd\0\u1e14\0\u1e4b\0\u1e82\0\u1eb9\0\u1ef0\0\u1f27\0\u1f5e"+
    "\0\u1f95\0\u1fcc\0\u2003\0\u093d\0\u203a\0\u2071\0\u20a8\0\u20df"+
    "\0\u2116\0\u214d\0\u2184\0\u21bb\0\u21f2\0\u0604\0\u2229\0\u093d";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[216];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37"+
    "\1\40\7\30\3\41\1\42\10\30\1\43\1\44\1\45"+
    "\17\30\1\46\4\47\2\30\1\50\2\30\1\51\1\32"+
    "\1\33\1\52\1\53\1\36\1\37\1\40\7\30\3\41"+
    "\1\42\10\30\1\43\1\44\1\45\17\30\1\46\4\47"+
    "\2\30\1\54\2\30\1\55\1\32\1\33\1\52\1\53"+
    "\1\36\1\37\1\40\7\30\3\41\1\42\10\30\1\43"+
    "\1\44\1\45\17\30\1\46\4\47\2\30\1\44\2\30"+
    "\1\56\1\32\1\33\1\52\1\53\1\36\1\37\1\40"+
    "\7\30\3\41\1\42\10\30\1\43\1\44\1\45\17\30"+
    "\1\46\4\47\2\30\1\50\2\30\1\57\1\32\1\33"+
    "\1\34\1\35\1\36\1\60\1\40\7\30\3\41\1\42"+
    "\10\30\1\43\1\44\1\45\17\30\1\46\4\47\2\30"+
    "\1\61\2\30\1\57\1\32\1\33\1\34\1\35\1\36"+
    "\1\37\1\40\7\30\3\41\1\42\10\30\1\43\1\44"+
    "\1\45\17\30\1\46\4\47\2\30\1\54\2\30\1\57"+
    "\1\32\1\33\1\34\1\35\1\36\1\60\1\40\7\30"+
    "\3\41\1\42\10\30\1\43\1\44\1\45\17\30\1\46"+
    "\4\47\2\30\1\62\2\30\1\57\1\32\1\33\1\34"+
    "\1\35\1\36\1\63\1\40\7\30\3\41\1\42\10\30"+
    "\1\43\1\44\1\45\17\30\1\46\4\47\2\30\1\44"+
    "\2\30\1\64\1\32\1\33\1\34\1\35\1\65\1\66"+
    "\1\40\7\30\3\41\1\42\10\30\1\43\1\44\1\45"+
    "\17\30\1\46\4\47\2\30\1\62\2\30\1\57\1\32"+
    "\1\33\1\34\1\35\1\67\1\37\1\40\7\30\3\41"+
    "\1\42\10\30\1\43\1\44\1\45\17\30\1\46\4\47"+
    "\2\30\1\44\2\30\1\64\1\32\1\33\1\34\1\35"+
    "\1\65\1\70\1\40\7\30\3\41\1\42\10\30\1\43"+
    "\1\44\1\45\17\30\1\46\4\47\2\30\1\62\2\30"+
    "\1\57\1\32\1\33\1\34\1\35\1\36\1\37\1\40"+
    "\7\30\3\41\1\42\10\30\1\43\1\44\1\45\17\30"+
    "\1\46\1\71\1\72\1\73\1\74\2\30\1\44\1\30"+
    "\57\75\1\76\67\75\1\76\67\75\1\76\67\75\1\76"+
    "\4\75\1\77\1\57\1\32\1\33\1\34\1\35\1\36"+
    "\1\60\1\40\7\77\3\41\1\42\10\77\1\43\1\44"+
    "\1\45\20\77\4\47\2\77\1\44\1\77\1\30\1\57"+
    "\1\32\1\33\1\100\1\101\1\36\1\37\1\40\7\30"+
    "\3\41\1\42\10\30\1\43\1\44\1\45\17\30\1\46"+
    "\4\47\2\30\1\44\2\30\1\57\1\32\1\33\1\34"+
    "\1\35\1\36\1\102\1\40\7\30\3\41\1\42\10\30"+
    "\1\43\1\44\1\45\17\30\1\46\4\47\2\30\1\44"+
    "\2\30\1\57\1\32\1\33\1\34\1\35\1\36\1\37"+
    "\1\40\7\30\3\41\1\42\10\30\1\43\1\44\1\45"+
    "\17\30\1\46\4\47\2\30\1\44\1\30\1\75\1\103"+
    "\6\75\1\41\7\75\3\41\44\75\4\104\1\105\3\104"+
    "\1\106\7\104\3\106\44\104\1\107\5\110\1\111\2\110"+
    "\7\107\4\110\10\107\3\110\20\107\4\110\2\107\1\110"+
    "\1\107\1\112\10\0\7\112\4\0\10\112\3\0\20\112"+
    "\4\0\2\112\1\0\1\113\2\114\1\115\1\114\1\116"+
    "\4\114\1\117\1\120\2\121\1\122\2\121\1\123\1\114"+
    "\2\0\1\124\6\121\1\125\3\114\1\126\2\121\1\127"+
    "\1\130\1\131\1\132\1\121\1\133\1\121\1\134\1\135"+
    "\1\121\1\136\1\137\5\114\2\121\1\114\1\140\66\0"+
    "\1\141\10\0\1\41\7\0\3\41\43\0\1\141\10\0"+
    "\1\41\7\0\3\41\133\0\20\142\2\0\44\142\1\143"+
    "\4\114\1\116\4\114\1\117\1\120\2\121\1\122\2\121"+
    "\1\123\1\114\2\0\1\124\2\121\1\144\3\121\1\125"+
    "\3\114\1\126\2\121\1\127\1\130\1\131\1\132\1\121"+
    "\1\133\1\121\1\134\1\135\1\121\1\136\1\137\5\114"+
    "\2\121\1\114\1\140\3\114\1\145\1\116\4\114\1\117"+
    "\1\120\2\121\1\122\2\121\1\123\1\114\2\0\1\124"+
    "\6\121\1\125\3\114\1\126\2\121\1\127\1\130\1\131"+
    "\1\132\1\121\1\133\1\121\1\134\1\135\1\121\1\136"+
    "\1\137\5\114\2\121\1\114\1\140\2\114\1\115\1\114"+
    "\1\116\1\146\3\114\1\117\1\120\2\121\1\122\2\121"+
    "\1\123\1\114\2\0\1\124\6\121\1\125\3\114\1\126"+
    "\2\121\1\127\1\130\1\131\1\132\1\121\1\133\1\121"+
    "\1\134\1\135\1\121\1\136\1\137\5\114\2\121\1\114"+
    "\1\140\4\114\1\116\4\114\1\117\1\120\2\121\1\122"+
    "\2\121\1\123\1\114\2\0\1\124\6\121\1\125\3\114"+
    "\1\126\2\121\1\127\1\130\1\131\1\132\1\121\1\133"+
    "\1\121\1\134\1\135\1\121\1\136\1\137\5\114\2\121"+
    "\1\114\1\140\4\114\1\147\1\150\3\114\1\117\1\120"+
    "\2\121\1\122\2\121\1\123\1\114\2\0\1\124\6\121"+
    "\1\125\3\114\1\126\2\121\1\127\1\130\1\131\1\132"+
    "\1\121\1\133\1\121\1\134\1\135\1\121\1\136\1\137"+
    "\5\114\2\121\1\114\1\140\1\151\10\0\7\151\4\0"+
    "\10\151\3\0\20\151\4\0\2\151\1\0\1\152\12\0"+
    "\1\153\64\0\1\106\7\0\3\106\44\0\1\107\10\0"+
    "\7\107\4\0\10\107\3\0\20\107\4\0\2\107\1\0"+
    "\1\107\1\112\10\0\7\112\4\0\10\112\3\0\20\112"+
    "\4\0\2\112\1\0\2\112\5\0\1\154\2\0\7\112"+
    "\4\0\10\112\3\0\20\112\4\0\2\112\1\0\1\112"+
    "\11\0\1\121\1\155\5\121\4\0\10\121\3\0\17\121"+
    "\5\0\2\121\13\0\4\121\1\156\2\121\4\0\10\121"+
    "\3\0\17\121\5\0\2\121\13\0\7\121\4\0\10\121"+
    "\3\0\17\121\5\0\2\121\13\0\1\121\1\157\5\121"+
    "\4\0\10\121\3\0\17\121\5\0\2\121\13\0\3\121"+
    "\1\160\3\121\4\0\10\121\3\0\17\121\5\0\2\121"+
    "\13\0\1\121\1\161\5\121\4\0\10\121\3\0\17\121"+
    "\5\0\2\121\13\0\7\121\4\0\10\121\3\0\1\121"+
    "\1\162\7\121\1\163\5\121\5\0\2\121\13\0\7\121"+
    "\4\0\10\121\3\0\14\121\1\164\2\121\5\0\2\121"+
    "\13\0\7\121\4\0\1\121\1\165\6\121\3\0\17\121"+
    "\5\0\2\121\13\0\7\121\4\0\5\121\1\166\2\121"+
    "\3\0\17\121\5\0\2\121\13\0\1\121\1\167\5\121"+
    "\4\0\10\121\3\0\17\121\5\0\2\121\13\0\7\121"+
    "\4\0\10\121\3\0\1\121\1\170\15\121\5\0\2\121"+
    "\13\0\7\121\4\0\7\121\1\171\3\0\17\121\5\0"+
    "\2\121\13\0\4\121\1\172\2\121\4\0\10\121\3\0"+
    "\3\121\1\173\13\121\5\0\2\121\13\0\4\121\1\174"+
    "\2\121\4\0\10\121\3\0\17\121\5\0\2\121\13\0"+
    "\1\121\1\175\5\121\4\0\10\121\3\0\17\121\5\0"+
    "\2\121\10\0\1\154\60\0\20\142\2\0\53\142\1\176"+
    "\11\142\2\0\45\142\11\0\1\121\1\177\5\121\4\0"+
    "\10\121\3\0\17\121\5\0\2\121\2\0\1\151\10\0"+
    "\7\151\4\0\10\151\3\0\20\151\4\0\2\151\1\0"+
    "\2\151\5\0\1\154\2\0\7\151\4\0\10\151\3\0"+
    "\20\151\4\0\2\151\1\0\1\151\15\0\1\200\62\0"+
    "\2\121\1\201\4\121\4\0\10\121\3\0\17\121\5\0"+
    "\2\121\13\0\5\121\1\202\1\121\4\0\10\121\3\0"+
    "\17\121\5\0\2\121\13\0\7\121\4\0\10\121\3\0"+
    "\17\121\5\0\1\203\1\121\13\0\7\121\4\0\1\121"+
    "\1\204\6\121\3\0\17\121\5\0\2\121\13\0\4\121"+
    "\1\122\2\121\4\0\10\121\3\0\17\121\5\0\2\121"+
    "\13\0\7\121\4\0\7\121\1\205\3\0\17\121\5\0"+
    "\2\121\13\0\4\121\1\206\2\121\4\0\10\121\3\0"+
    "\17\121\5\0\2\121\13\0\7\121\4\0\3\121\1\207"+
    "\4\121\3\0\17\121\5\0\2\121\13\0\3\121\1\210"+
    "\3\121\4\0\10\121\3\0\17\121\5\0\2\121\13\0"+
    "\7\121\4\0\10\121\3\0\7\121\1\211\7\121\5\0"+
    "\2\121\13\0\7\121\4\0\10\121\3\0\1\121\1\212"+
    "\15\121\5\0\2\121\13\0\7\121\4\0\10\121\3\0"+
    "\1\121\1\213\15\121\5\0\2\121\13\0\5\121\1\214"+
    "\1\121\4\0\10\121\3\0\17\121\5\0\2\121\13\0"+
    "\7\121\4\0\10\121\3\0\14\121\1\215\2\121\5\0"+
    "\2\121\13\0\7\121\4\0\3\121\1\216\4\121\3\0"+
    "\17\121\5\0\2\121\13\0\7\121\4\0\7\121\1\217"+
    "\3\0\17\121\5\0\2\121\13\0\7\121\4\0\2\121"+
    "\1\220\5\121\3\0\17\121\5\0\2\121\20\0\1\221"+
    "\61\0\3\121\1\222\3\121\4\0\10\121\3\0\17\121"+
    "\5\0\2\121\13\0\1\121\1\223\5\121\4\0\10\121"+
    "\3\0\17\121\5\0\2\121\13\0\4\121\1\224\2\121"+
    "\4\0\10\121\3\0\17\121\5\0\2\121\13\0\7\121"+
    "\4\0\10\121\3\0\2\121\1\225\14\121\5\0\2\121"+
    "\13\0\7\121\4\0\4\121\1\226\3\121\3\0\17\121"+
    "\5\0\2\121\13\0\3\121\1\227\3\121\4\0\10\121"+
    "\3\0\17\121\5\0\2\121\13\0\7\121\4\0\10\121"+
    "\3\0\3\121\1\230\13\121\5\0\2\121\13\0\1\121"+
    "\1\231\5\121\4\0\10\121\3\0\17\121\5\0\2\121"+
    "\13\0\7\121\4\0\10\121\3\0\7\121\1\165\7\121"+
    "\5\0\2\121\13\0\7\121\4\0\4\121\1\232\3\121"+
    "\3\0\17\121\5\0\2\121\13\0\7\121\4\0\10\121"+
    "\3\0\1\233\3\121\1\234\1\235\2\121\1\236\1\121"+
    "\1\237\4\121\5\0\2\121\13\0\1\121\1\240\5\121"+
    "\4\0\10\121\3\0\4\121\1\241\12\121\5\0\2\121"+
    "\13\0\3\121\1\242\3\121\4\0\10\121\3\0\17\121"+
    "\5\0\2\121\13\0\1\243\6\121\4\0\10\121\3\0"+
    "\17\121\5\0\2\121\13\0\7\121\4\0\3\121\1\244"+
    "\4\121\3\0\17\121\5\0\2\121\13\0\4\121\1\245"+
    "\2\121\4\0\10\121\3\0\17\121\5\0\2\121\13\0"+
    "\4\121\1\246\2\121\4\0\10\121\3\0\17\121\5\0"+
    "\2\121\13\0\1\121\1\247\5\121\4\0\10\121\3\0"+
    "\17\121\5\0\2\121\13\0\7\121\4\0\10\121\3\0"+
    "\3\121\1\250\13\121\5\0\2\121\13\0\7\121\4\0"+
    "\3\121\1\251\4\121\3\0\17\121\5\0\2\121\13\0"+
    "\4\121\1\252\2\121\4\0\10\121\3\0\17\121\5\0"+
    "\2\121\13\0\1\121\1\165\5\121\4\0\10\121\3\0"+
    "\17\121\5\0\2\121\13\0\7\121\4\0\6\121\1\253"+
    "\1\121\3\0\17\121\5\0\2\121\13\0\1\121\1\254"+
    "\5\121\4\0\10\121\3\0\17\121\5\0\2\121\13\0"+
    "\7\121\4\0\10\121\3\0\1\121\1\255\7\121\1\256"+
    "\5\121\5\0\2\121\13\0\7\121\4\0\1\121\1\257"+
    "\6\121\3\0\17\121\5\0\2\121\13\0\7\121\4\0"+
    "\5\121\1\260\2\121\3\0\17\121\5\0\2\121\13\0"+
    "\7\121\4\0\10\121\3\0\1\121\1\261\15\121\5\0"+
    "\2\121\13\0\7\121\4\0\7\121\1\262\3\0\17\121"+
    "\5\0\2\121\13\0\7\121\4\0\1\121\1\240\6\121"+
    "\3\0\17\121\5\0\2\121\13\0\7\121\4\0\10\121"+
    "\3\0\3\121\1\257\13\121\5\0\2\121\13\0\7\121"+
    "\4\0\10\121\3\0\17\121\1\263\4\0\2\121\13\0"+
    "\7\121\4\0\10\121\3\0\16\121\1\264\5\0\2\121"+
    "\13\0\7\121\4\0\2\121\1\265\5\121\3\0\17\121"+
    "\5\0\2\121\13\0\7\121\4\0\10\121\3\0\3\121"+
    "\1\165\13\121\5\0\2\121\13\0\3\121\1\266\3\121"+
    "\4\0\10\121\3\0\17\121\5\0\2\121\13\0\7\121"+
    "\4\0\10\121\3\0\3\121\1\267\13\121\5\0\2\121"+
    "\13\0\7\121\4\0\3\121\1\165\4\121\3\0\17\121"+
    "\5\0\2\121\13\0\5\121\1\270\1\121\4\0\10\121"+
    "\3\0\17\121\5\0\2\121\13\0\7\121\4\0\7\121"+
    "\1\257\3\0\17\121\5\0\2\121\13\0\4\121\1\271"+
    "\2\121\4\0\10\121\3\0\17\121\5\0\2\121\13\0"+
    "\3\121\1\272\3\121\4\0\10\121\3\0\17\121\5\0"+
    "\2\121\13\0\7\121\4\0\10\121\3\0\1\121\1\273"+
    "\15\121\5\0\2\121\13\0\7\121\4\0\10\121\3\0"+
    "\1\121\1\274\15\121\5\0\2\121\13\0\3\121\1\275"+
    "\3\121\4\0\10\121\3\0\17\121\5\0\2\121\13\0"+
    "\7\121\4\0\3\121\1\276\4\121\3\0\17\121\5\0"+
    "\2\121\13\0\7\121\4\0\10\121\3\0\1\121\1\277"+
    "\15\121\5\0\2\121\13\0\3\121\1\300\3\121\4\0"+
    "\10\121\3\0\17\121\5\0\2\121\13\0\7\121\4\0"+
    "\10\121\3\0\11\121\1\301\5\121\5\0\2\121\13\0"+
    "\7\121\4\0\4\121\1\302\3\121\3\0\17\121\5\0"+
    "\2\121\13\0\7\121\4\0\10\121\3\0\3\121\1\303"+
    "\13\121\5\0\2\121\13\0\7\121\4\0\10\121\3\0"+
    "\7\121\1\257\7\121\5\0\2\121\13\0\7\121\4\0"+
    "\4\121\1\304\3\121\3\0\17\121\5\0\2\121\13\0"+
    "\7\121\4\0\7\121\1\305\3\0\17\121\5\0\2\121"+
    "\13\0\7\121\4\0\4\121\1\306\3\121\3\0\17\121"+
    "\5\0\2\121\13\0\4\121\1\165\2\121\4\0\10\121"+
    "\3\0\17\121\5\0\2\121\13\0\4\121\1\307\2\121"+
    "\4\0\10\121\3\0\17\121\5\0\2\121\13\0\7\121"+
    "\4\0\7\121\1\230\3\0\17\121\5\0\2\121\13\0"+
    "\7\121\4\0\3\121\1\310\4\121\3\0\17\121\5\0"+
    "\2\121\13\0\1\121\1\257\5\121\4\0\10\121\3\0"+
    "\17\121\5\0\2\121\13\0\1\121\1\311\5\121\4\0"+
    "\10\121\3\0\17\121\5\0\2\121\13\0\7\121\4\0"+
    "\10\121\3\0\1\121\1\312\15\121\5\0\2\121\13\0"+
    "\7\121\4\0\5\121\1\313\2\121\3\0\17\121\5\0"+
    "\2\121\13\0\1\121\1\314\5\121\4\0\10\121\3\0"+
    "\17\121\5\0\2\121\13\0\3\121\1\315\3\121\4\0"+
    "\10\121\3\0\17\121\5\0\2\121\13\0\5\121\1\316"+
    "\1\121\4\0\10\121\3\0\17\121\5\0\2\121\13\0"+
    "\4\121\1\317\2\121\4\0\10\121\3\0\17\121\5\0"+
    "\2\121\13\0\7\121\4\0\6\121\1\320\1\121\3\0"+
    "\17\121\5\0\2\121\13\0\7\121\4\0\10\121\3\0"+
    "\1\121\1\321\15\121\5\0\2\121\13\0\7\121\4\0"+
    "\10\121\3\0\11\121\1\322\5\121\5\0\2\121\13\0"+
    "\7\121\4\0\10\121\3\0\17\121\5\0\1\121\1\323"+
    "\13\0\7\121\4\0\7\121\1\324\3\0\17\121\5\0"+
    "\2\121\13\0\4\121\1\257\2\121\4\0\10\121\3\0"+
    "\17\121\5\0\2\121\13\0\7\121\4\0\7\121\1\303"+
    "\3\0\17\121\5\0\2\121\13\0\1\121\1\325\5\121"+
    "\4\0\10\121\3\0\17\121\5\0\2\121\2\0\11\326"+
    "\7\121\4\0\10\121\3\326\17\121\5\326\2\121\2\326"+
    "\11\0\4\121\1\327\2\121\4\0\10\121\3\0\17\121"+
    "\5\0\2\121\13\0\7\121\4\0\3\121\1\330\4\121"+
    "\3\0\17\121\5\0\2\121\2\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[8800];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\27\0\12\1\1\11\32\1\2\11\5\1\2\11\2\1"+
    "\2\11\2\1\3\11\4\1\1\11\15\1\1\0\3\1"+
    "\4\11\2\1\1\0\1\11\23\1\1\0\20\1\1\11"+
    "\41\1\1\11\42\1\1\11\2\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[216];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  private Deque<Integer> stack = new ArrayDeque<>();


  public void yypushState(int newState) {
    stack.push(yystate());
    yybegin(newState);
  }

  public void yypopState() {
    yybegin(stack.pop());
  }


  public LatexLexer() {
    this(null);
  }

  /**
   * In order to avoid a parsing error for new environment definitions, this keeps track of the number of braces in the \newenvironment
   * parameters, so as to know when the parameters are exited.
   */
  private int newEnvironmentBracesNesting = 0;

  /**
   * Also keep track of brackets of verbatim environment optional arguments.
   */
  private int verbatimOptionalArgumentBracketsCount = 0;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public LatexLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return NORMAL_TEXT_WORD;
            } 
            // fall through
          case 56: break;
          case 2: 
            { return com.intellij.psi.TokenType.BAD_CHARACTER;
            } 
            // fall through
          case 57: break;
          case 3: 
            { return OPEN_PAREN;
            } 
            // fall through
          case 58: break;
          case 4: 
            { return CLOSE_PAREN;
            } 
            // fall through
          case 59: break;
          case 5: 
            { return OPEN_BRACKET;
            } 
            // fall through
          case 60: break;
          case 6: 
            { return CLOSE_BRACKET;
            } 
            // fall through
          case 61: break;
          case 7: 
            { return OPEN_BRACE;
            } 
            // fall through
          case 62: break;
          case 8: 
            { return CLOSE_BRACE;
            } 
            // fall through
          case 63: break;
          case 9: 
            { return com.intellij.psi.TokenType.WHITE_SPACE;
            } 
            // fall through
          case 64: break;
          case 10: 
            { return COMMENT_TOKEN;
            } 
            // fall through
          case 65: break;
          case 11: 
            { return AMPERSAND;
            } 
            // fall through
          case 66: break;
          case 12: 
            { return STAR;
            } 
            // fall through
          case 67: break;
          case 13: 
            { return NORMAL_TEXT_CHAR;
            } 
            // fall through
          case 68: break;
          case 14: 
            { yypushState(INLINE_MATH); return INLINE_MATH_START;
            } 
            // fall through
          case 69: break;
          case 15: 
            { return M_OPEN_BRACKET;
            } 
            // fall through
          case 70: break;
          case 16: 
            { return M_CLOSE_BRACKET;
            } 
            // fall through
          case 71: break;
          case 17: 
            { yypopState(); return INLINE_MATH_END;
            } 
            // fall through
          case 72: break;
          case 18: 
            { yypopState(); return CLOSE_BRACE;
            } 
            // fall through
          case 73: break;
          case 19: 
            { yypushState(NESTED_INLINE_MATH); return INLINE_MATH_START;
            } 
            // fall through
          case 74: break;
          case 20: 
            { yypopState(); yypushState(NEW_ENVIRONMENT_DEFINITION); return CLOSE_BRACE;
            } 
            // fall through
          case 75: break;
          case 21: 
            { newEnvironmentBracesNesting++; return OPEN_BRACE;
            } 
            // fall through
          case 76: break;
          case 22: 
            { newEnvironmentBracesNesting--;
        if(newEnvironmentBracesNesting == 0) {
            yypopState(); yypushState(NEW_ENVIRONMENT_SKIP_BRACE);
            // We could have return normal text, but in this way the braces still match
            return OPEN_BRACE;
        } else {
            return CLOSE_BRACE;
        }
            } 
            // fall through
          case 77: break;
          case 23: 
            { yypopState(); newEnvironmentBracesNesting = 1; yypushState(NEW_ENVIRONMENT_DEFINITION_END); return CLOSE_BRACE;
            } 
            // fall through
          case 78: break;
          case 24: 
            { newEnvironmentBracesNesting--;
        if(newEnvironmentBracesNesting == 0) {
            yypopState();
        }
        return CLOSE_BRACE;
            } 
            // fall through
          case 79: break;
          case 25: 
            { yypopState(); yypushState(INLINE_VERBATIM_PIPE); return OPEN_BRACE;
            } 
            // fall through
          case 80: break;
          case 26: 
            { yypopState(); yypushState(INLINE_VERBATIM_EXCL_MARK); return OPEN_BRACE;
            } 
            // fall through
          case 81: break;
          case 27: 
            { yypopState(); yypushState(INLINE_VERBATIM_QUOTES); return OPEN_BRACE;
            } 
            // fall through
          case 82: break;
          case 28: 
            { yypopState(); yypushState(INLINE_VERBATIM_EQUALS); return OPEN_BRACE;
            } 
            // fall through
          case 83: break;
          case 29: 
            { return RAW_TEXT_TOKEN;
            } 
            // fall through
          case 84: break;
          case 30: 
            { yypopState();
        // toString to fix comparisons of charsequence subsequences with string
        if (Magic.Environment.verbatim.contains(yytext().toString())) {
            yypushState(VERBATIM_START);
        }
        return NORMAL_TEXT_WORD;
            } 
            // fall through
          case 85: break;
          case 31: 
            { verbatimOptionalArgumentBracketsCount++; return OPEN_BRACKET;
            } 
            // fall through
          case 86: break;
          case 32: 
            { verbatimOptionalArgumentBracketsCount--;
        if (verbatimOptionalArgumentBracketsCount == 0) yypopState(); yypushState(VERBATIM);
        return CLOSE_BRACKET;
            } 
            // fall through
          case 87: break;
          case 33: 
            { yypopState(); yypushState(POSSIBLE_VERBATIM_OPTIONAL_ARG); return CLOSE_BRACE;
            } 
            // fall through
          case 88: break;
          case 34: 
            { yypopState(); yypushState(VERBATIM); return RAW_TEXT_TOKEN;
            } 
            // fall through
          case 89: break;
          case 35: 
            { verbatimOptionalArgumentBracketsCount++; yypopState(); yypushState(VERBATIM_OPTIONAL_ARG); return OPEN_BRACKET;
            } 
            // fall through
          case 90: break;
          case 36: 
            { yypopState(); yypushState(VERBATIM); return com.intellij.psi.TokenType.WHITE_SPACE;
            } 
            // fall through
          case 91: break;
          case 37: 
            { // Pop current state
        yypopState();
        if (Magic.Environment.verbatim.contains(yytext().toString())) {
            // Pop verbatim state
            yypopState();
            return NORMAL_TEXT_WORD;
        }
        return RAW_TEXT_TOKEN;
            } 
            // fall through
          case 92: break;
          case 38: 
            { yypopState(); return RAW_TEXT_TOKEN;
            } 
            // fall through
          case 93: break;
          case 39: 
            { return COMMAND_TOKEN;
            } 
            // fall through
          case 94: break;
          case 40: 
            { yypushState(INLINE_MATH_LATEX); return INLINE_MATH_START;
            } 
            // fall through
          case 95: break;
          case 41: 
            { yypushState(DISPLAY_MATH); return DISPLAY_MATH_START;
            } 
            // fall through
          case 96: break;
          case 42: 
            { yypopState(); return DISPLAY_MATH_END;
            } 
            // fall through
          case 97: break;
          case 43: 
            { return DISPLAY_MATH_START;
            } 
            // fall through
          case 98: break;
          case 44: 
            { return DISPLAY_MATH_END;
            } 
            // fall through
          case 99: break;
          case 45: 
            { yypushState(PREAMBLE_OPTION); return OPEN_BRACE;
            } 
            // fall through
          case 100: break;
          case 46: 
            { return BEGIN_PSEUDOCODE_BLOCK;
            } 
            // fall through
          case 101: break;
          case 47: 
            { return END_TOKEN;
            } 
            // fall through
          case 102: break;
          case 48: 
            { yypushState(POSSIBLE_VERBATIM_END); return END_TOKEN;
            } 
            // fall through
          case 103: break;
          case 49: 
            { return MIDDLE_PSEUDOCODE_BLOCK;
            } 
            // fall through
          case 104: break;
          case 50: 
            { yypushState(INLINE_VERBATIM_START); return COMMAND_TOKEN;
            } 
            // fall through
          case 105: break;
          case 51: 
            { yypushState(TEXT_INSIDE_INLINE_MATH); return COMMAND_TOKEN;
            } 
            // fall through
          case 106: break;
          case 52: 
            { yypushState(POSSIBLE_VERBATIM_BEGIN); return BEGIN_TOKEN;
            } 
            // fall through
          case 107: break;
          case 53: 
            { return END_PSEUDOCODE_BLOCK;
            } 
            // fall through
          case 108: break;
          case 54: 
            { return COMMAND_IFNEXTCHAR;
            } 
            // fall through
          case 109: break;
          case 55: 
            { yypushState(NEW_ENVIRONMENT_DEFINITION_NAME); return COMMAND_TOKEN;
            } 
            // fall through
          case 110: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
