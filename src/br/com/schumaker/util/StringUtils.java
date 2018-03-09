package br.com.schumaker.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author hudson.schumaker
 */
public class StringUtils {

    protected int ordinalIndexOf(String str, String substr, int n) {
        int pos = str.indexOf(substr);
        while (--n > 0 && pos != -1) {
            pos = str.indexOf(substr, pos + 1);
        }
        return pos;
    }

    protected String html2utf(String texto) {
        String txt = texto;
        txt = txt.replaceAll("&nbsp;", "&#160;");
        txt = txt.replaceAll("&iexcl;", "&#161;");
        txt = txt.replaceAll("&cent;", "&#162;");
        txt = txt.replaceAll("&pound;", "&#163;");
        txt = txt.replaceAll("&curren;", "&#164;");
        txt = txt.replaceAll("&yen;", "&#165;");
        txt = txt.replaceAll("&brvbar;", "&#166;");
        txt = txt.replaceAll("&sect;", "&#167;");
        txt = txt.replaceAll("&uml;", "&#168;");
        txt = txt.replaceAll("&copy;", "&#169;");
        txt = txt.replaceAll("&ordf;", "&#170;");
        txt = txt.replaceAll("&laquo;", "&#171;");
        txt = txt.replaceAll("&not;", "&#172;");
        txt = txt.replaceAll("&shy;", "&#173;");
        txt = txt.replaceAll("&reg;", "&#174;");
        txt = txt.replaceAll("&macr;", "&#175;");
        txt = txt.replaceAll("&deg;", "&#176;");
        txt = txt.replaceAll("&plusmn;", "&#177;");
        txt = txt.replaceAll("&sup2;", "&#178;");
        txt = txt.replaceAll("&sup3;", "&#179;");
        txt = txt.replaceAll("&acute;", "&#180;");
        txt = txt.replaceAll("&micro;", "&#181;");
        txt = txt.replaceAll("&para;", "&#182;");
        txt = txt.replaceAll("&middot;", "&#183;");
        txt = txt.replaceAll("&cedil;", "&#184;");
        txt = txt.replaceAll("&sup1;", "&#185;");
        txt = txt.replaceAll("&ordm;", "&#186;");
        txt = txt.replaceAll("&raquo;", "&#187;");
        txt = txt.replaceAll("&frac14;", "&#188;");
        txt = txt.replaceAll("&frac12;", "&#189;");
        txt = txt.replaceAll("&frac34;", "&#190;");
        txt = txt.replaceAll("&iquest;", "&#191;");
        txt = txt.replaceAll("&Agrave;", "&#192;");
        txt = txt.replaceAll("&Aacute;", "&#193;");
        txt = txt.replaceAll("&Acirc;", "&#194;");
        txt = txt.replaceAll("&Atilde;", "&#195;");
        txt = txt.replaceAll("&Auml;", "&#196;");
        txt = txt.replaceAll("&Aring;", "&#197;");
        txt = txt.replaceAll("&AElig;", "&#198;");
        txt = txt.replaceAll("&Ccedil;", "&#199;");
        txt = txt.replaceAll("&Egrave;", "&#200;");
        txt = txt.replaceAll("&Eacute;", "&#201;");
        txt = txt.replaceAll("&Ecirc;", "&#202;");
        txt = txt.replaceAll("&Euml;", "&#203;");
        txt = txt.replaceAll("&Igrave;", "&#204;");
        txt = txt.replaceAll("&Iacute;", "&#205;");
        txt = txt.replaceAll("&Icirc;", "&#206;");
        txt = txt.replaceAll("&Iuml;", "&#207;");
        txt = txt.replaceAll("&ETH;", "&#208;");
        txt = txt.replaceAll("&Ntilde;", "&#209;");
        txt = txt.replaceAll("&Ograve;", "&#210;");
        txt = txt.replaceAll("&Oacute;", "&#211;");
        txt = txt.replaceAll("&Ocirc;", "&#212;");
        txt = txt.replaceAll("&Otilde;", "&#213;");
        txt = txt.replaceAll("&Ouml;", "&#214;");
        txt = txt.replaceAll("&times;", "&#215;");
        txt = txt.replaceAll("&Oslash;", "&#216;");
        txt = txt.replaceAll("&Ugrave;", "&#217;");
        txt = txt.replaceAll("&Uacute;", "&#218;");
        txt = txt.replaceAll("&Ucirc;", "&#219;");
        txt = txt.replaceAll("&Uuml;", "&#220;");
        txt = txt.replaceAll("&Yacute;", "&#221;");
        txt = txt.replaceAll("&THORN;", "&#222;");
        txt = txt.replaceAll("&szlig;", "&#223;");
        txt = txt.replaceAll("&agrave;", "&#224;");
        txt = txt.replaceAll("&aacute;", "&#225;");
        txt = txt.replaceAll("&acirc;", "&#226;");
        txt = txt.replaceAll("&atilde;", "&#227;");
        txt = txt.replaceAll("&auml;", "&#228;");
        txt = txt.replaceAll("&aring;", "&#229;");
        txt = txt.replaceAll("&aelig;", "&#230;");
        txt = txt.replaceAll("&ccedil;", "&#231;");
        txt = txt.replaceAll("&egrave;", "&#232;");
        txt = txt.replaceAll("&eacute;", "&#233;");
        txt = txt.replaceAll("&ecirc;", "&#234;");
        txt = txt.replaceAll("&euml;", "&#235;");
        txt = txt.replaceAll("&igrave;", "&#236;");
        txt = txt.replaceAll("&iacute;", "&#237;");
        txt = txt.replaceAll("&icirc;", "&#238;");
        txt = txt.replaceAll("&iuml;", "&#239;");
        txt = txt.replaceAll("&eth;", "&#240;");
        txt = txt.replaceAll("&ntilde;", "&#241;");
        txt = txt.replaceAll("&ograve;", "&#242;");
        txt = txt.replaceAll("&oacute;", "&#243;");
        txt = txt.replaceAll("&ocirc;", "&#244;");
        txt = txt.replaceAll("&otilde;", "&#245;");
        txt = txt.replaceAll("&ouml;", "&#246;");
        txt = txt.replaceAll("&divide;", "&#247;");
        txt = txt.replaceAll("&oslash;", "&#248;");
        txt = txt.replaceAll("&ugrave;", "&#249;");
        txt = txt.replaceAll("&uacute;", "&#250;");
        txt = txt.replaceAll("&ucirc;", "&#251;");
        txt = txt.replaceAll("&uuml;", "&#252;");
        txt = txt.replaceAll("&yacute;", "&#253;");
        txt = txt.replaceAll("&thorn;", "&#254;");

        return txt.replaceAll("&yuml;", "&#255;");
    }

    private String inputStreamToString(InputStream inputStream) throws IOException {
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int length;
        while ((length = inputStream.read(buffer)) != -1) {
            result.write(buffer, 0, length);
        }
        return result.toString("UTF-8");
    }

    protected String removeCharsEspeciais(String value) {
        return value.replaceAll("[ãâàáä]", "a")
                .replaceAll("[êèéë]", "e")
                .replaceAll("[îìíï]", "i")
                .replaceAll("[õôòóö]", "o")
                .replaceAll("[ûúùü]", "u")
                .replaceAll("[ÃÂÀÁÄ]", "A")
                .replaceAll("[ÊÈÉË]", "E")
                .replaceAll("[ÎÌÍÏ]", "I")
                .replaceAll("[ÕÔÒÓÖ]", "O")
                .replaceAll("[ÛÙÚÜ]", "U")
                .replace('ç', 'c')
                .replace('Ç', 'C')
                .replace('ñ', 'n').replace('Ñ', 'N');
    }
}
