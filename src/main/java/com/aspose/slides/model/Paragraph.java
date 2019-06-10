/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose">
 *   Copyright (c) 2018 Aspose.Slides for Cloud
 * </copyright>
 * <summary>
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------------------------------------------
 */

package com.aspose.slides.model;

import java.util.Objects;
import com.aspose.slides.model.ResourceBase;
import com.aspose.slides.model.ResourceUri;
import com.aspose.slides.model.ResourceUriElement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;

/**
 * Represents paragraph resource
 */
@ApiModel(description = "Represents paragraph resource")
public class Paragraph extends ResourceBase {
  @SerializedName("MarginLeft")
  private Double marginLeft;

  @SerializedName("MarginRight")
  private Double marginRight;

  @SerializedName("SpaceBefore")
  private Double spaceBefore;

  @SerializedName("SpaceAfter")
  private Double spaceAfter;

  @SerializedName("SpaceWithin")
  private Double spaceWithin;

  @SerializedName("Indent")
  private Double indent;

  /**
   * Gets or Sets alignment
   */
  @JsonAdapter(AlignmentEnum.Adapter.class)
  public enum AlignmentEnum {
    LEFT("Left"),
    
    CENTER("Center"),
    
    RIGHT("Right"),
    
    JUSTIFY("Justify"),
    
    JUSTIFYLOW("JustifyLow"),
    
    DISTRIBUTED("Distributed"),
    
    NOTDEFINED("NotDefined");

    private String value;

    AlignmentEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AlignmentEnum fromValue(String text) {
      for (AlignmentEnum b : AlignmentEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AlignmentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AlignmentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AlignmentEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AlignmentEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Alignment")
  private AlignmentEnum alignment;

  /**
   * Gets or Sets fontAlignment
   */
  @JsonAdapter(FontAlignmentEnum.Adapter.class)
  public enum FontAlignmentEnum {
    AUTOMATIC("Automatic"),
    
    TOP("Top"),
    
    CENTER("Center"),
    
    BOTTOM("Bottom"),
    
    BASELINE("Baseline"),
    
    DEFAULT("Default");

    private String value;

    FontAlignmentEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FontAlignmentEnum fromValue(String text) {
      for (FontAlignmentEnum b : FontAlignmentEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FontAlignmentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FontAlignmentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FontAlignmentEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FontAlignmentEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("FontAlignment")
  private FontAlignmentEnum fontAlignment;

  @SerializedName("DefaultTabSize")
  private Double defaultTabSize;

  @SerializedName("Depth")
  private Integer depth;

  @SerializedName("BulletChar")
  private String bulletChar;

  @SerializedName("BulletHeight")
  private Double bulletHeight;

  /**
   * Gets or Sets bulletType
   */
  @JsonAdapter(BulletTypeEnum.Adapter.class)
  public enum BulletTypeEnum {
    NONE("None"),
    
    SYMBOL("Symbol"),
    
    NUMBERED("Numbered"),
    
    PICTURE("Picture"),
    
    NOTDEFINED("NotDefined");

    private String value;

    BulletTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BulletTypeEnum fromValue(String text) {
      for (BulletTypeEnum b : BulletTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<BulletTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BulletTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BulletTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return BulletTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("BulletType")
  private BulletTypeEnum bulletType;

  @SerializedName("NumberedBulletStartWith")
  private Integer numberedBulletStartWith;

  /**
   * Gets or Sets numberedBulletStyle
   */
  @JsonAdapter(NumberedBulletStyleEnum.Adapter.class)
  public enum NumberedBulletStyleEnum {
    BULLETALPHALCPERIOD("BulletAlphaLCPeriod"),
    
    BULLETALPHAUCPERIOD("BulletAlphaUCPeriod"),
    
    BULLETARABICPARENRIGHT("BulletArabicParenRight"),
    
    BULLETARABICPERIOD("BulletArabicPeriod"),
    
    BULLETROMANLCPARENBOTH("BulletRomanLCParenBoth"),
    
    BULLETROMANLCPARENRIGHT("BulletRomanLCParenRight"),
    
    BULLETROMANLCPERIOD("BulletRomanLCPeriod"),
    
    BULLETROMANUCPERIOD("BulletRomanUCPeriod"),
    
    BULLETALPHALCPARENBOTH("BulletAlphaLCParenBoth"),
    
    BULLETALPHALCPARENRIGHT("BulletAlphaLCParenRight"),
    
    BULLETALPHAUCPARENBOTH("BulletAlphaUCParenBoth"),
    
    BULLETALPHAUCPARENRIGHT("BulletAlphaUCParenRight"),
    
    BULLETARABICPARENBOTH("BulletArabicParenBoth"),
    
    BULLETARABICPLAIN("BulletArabicPlain"),
    
    BULLETROMANUCPARENBOTH("BulletRomanUCParenBoth"),
    
    BULLETROMANUCPARENRIGHT("BulletRomanUCParenRight"),
    
    BULLETSIMPCHINPLAIN("BulletSimpChinPlain"),
    
    BULLETSIMPCHINPERIOD("BulletSimpChinPeriod"),
    
    BULLETCIRCLENUMDBPLAIN("BulletCircleNumDBPlain"),
    
    BULLETCIRCLENUMWDWHITEPLAIN("BulletCircleNumWDWhitePlain"),
    
    BULLETCIRCLENUMWDBLACKPLAIN("BulletCircleNumWDBlackPlain"),
    
    BULLETTRADCHINPLAIN("BulletTradChinPlain"),
    
    BULLETTRADCHINPERIOD("BulletTradChinPeriod"),
    
    BULLETARABICALPHADASH("BulletArabicAlphaDash"),
    
    BULLETARABICABJADDASH("BulletArabicAbjadDash"),
    
    BULLETHEBREWALPHADASH("BulletHebrewAlphaDash"),
    
    BULLETKANJIKOREANPLAIN("BulletKanjiKoreanPlain"),
    
    BULLETKANJIKOREANPERIOD("BulletKanjiKoreanPeriod"),
    
    BULLETARABICDBPLAIN("BulletArabicDBPlain"),
    
    BULLETARABICDBPERIOD("BulletArabicDBPeriod"),
    
    BULLETTHAIALPHAPERIOD("BulletThaiAlphaPeriod"),
    
    BULLETTHAIALPHAPARENRIGHT("BulletThaiAlphaParenRight"),
    
    BULLETTHAIALPHAPARENBOTH("BulletThaiAlphaParenBoth"),
    
    BULLETTHAINUMPERIOD("BulletThaiNumPeriod"),
    
    BULLETTHAINUMPARENRIGHT("BulletThaiNumParenRight"),
    
    BULLETTHAINUMPARENBOTH("BulletThaiNumParenBoth"),
    
    BULLETHINDIALPHAPERIOD("BulletHindiAlphaPeriod"),
    
    BULLETHINDINUMPERIOD("BulletHindiNumPeriod"),
    
    BULLETKANJISIMPCHINDBPERIOD("BulletKanjiSimpChinDBPeriod"),
    
    BULLETHINDINUMPARENRIGHT("BulletHindiNumParenRight"),
    
    BULLETHINDIALPHA1PERIOD("BulletHindiAlpha1Period"),
    
    NOTDEFINED("NotDefined");

    private String value;

    NumberedBulletStyleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NumberedBulletStyleEnum fromValue(String text) {
      for (NumberedBulletStyleEnum b : NumberedBulletStyleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<NumberedBulletStyleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NumberedBulletStyleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NumberedBulletStyleEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return NumberedBulletStyleEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("NumberedBulletStyle")
  private NumberedBulletStyleEnum numberedBulletStyle;

  /**
   * Gets or Sets hangingPunctuation
   */
  @JsonAdapter(HangingPunctuationEnum.Adapter.class)
  public enum HangingPunctuationEnum {
    FALSE("False"),
    
    TRUE("True"),
    
    NOTDEFINED("NotDefined");

    private String value;

    HangingPunctuationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static HangingPunctuationEnum fromValue(String text) {
      for (HangingPunctuationEnum b : HangingPunctuationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<HangingPunctuationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HangingPunctuationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HangingPunctuationEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return HangingPunctuationEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("HangingPunctuation")
  private HangingPunctuationEnum hangingPunctuation;

  /**
   * Gets or Sets eastAsianLineBreak
   */
  @JsonAdapter(EastAsianLineBreakEnum.Adapter.class)
  public enum EastAsianLineBreakEnum {
    FALSE("False"),
    
    TRUE("True"),
    
    NOTDEFINED("NotDefined");

    private String value;

    EastAsianLineBreakEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EastAsianLineBreakEnum fromValue(String text) {
      for (EastAsianLineBreakEnum b : EastAsianLineBreakEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<EastAsianLineBreakEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EastAsianLineBreakEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EastAsianLineBreakEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EastAsianLineBreakEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("EastAsianLineBreak")
  private EastAsianLineBreakEnum eastAsianLineBreak;

  /**
   * Gets or Sets latinLineBreak
   */
  @JsonAdapter(LatinLineBreakEnum.Adapter.class)
  public enum LatinLineBreakEnum {
    FALSE("False"),
    
    TRUE("True"),
    
    NOTDEFINED("NotDefined");

    private String value;

    LatinLineBreakEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LatinLineBreakEnum fromValue(String text) {
      for (LatinLineBreakEnum b : LatinLineBreakEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<LatinLineBreakEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LatinLineBreakEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LatinLineBreakEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return LatinLineBreakEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("LatinLineBreak")
  private LatinLineBreakEnum latinLineBreak;

  /**
   * Gets or Sets rightToLeft
   */
  @JsonAdapter(RightToLeftEnum.Adapter.class)
  public enum RightToLeftEnum {
    FALSE("False"),
    
    TRUE("True"),
    
    NOTDEFINED("NotDefined");

    private String value;

    RightToLeftEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RightToLeftEnum fromValue(String text) {
      for (RightToLeftEnum b : RightToLeftEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RightToLeftEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RightToLeftEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RightToLeftEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RightToLeftEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("RightToLeft")
  private RightToLeftEnum rightToLeft;

  @SerializedName("PortionList")
  private List<ResourceUriElement> portionList = null;


  public Paragraph() {
    super();
    setAlternateLinks(new ArrayList<ResourceUri>());
    setPortionList(new ArrayList<ResourceUriElement>());
  }

  public Paragraph marginLeft(Double marginLeft) {
    this.marginLeft = marginLeft;
    return this;
  }

   /**
   * Get marginLeft
   * @return marginLeft
  **/
  @ApiModelProperty(value = "")
  public Double getMarginLeft() {
    return marginLeft;
  }

  public void setMarginLeft(Double marginLeft) {
    this.marginLeft = marginLeft;
  }

  public Paragraph marginRight(Double marginRight) {
    this.marginRight = marginRight;
    return this;
  }

   /**
   * Get marginRight
   * @return marginRight
  **/
  @ApiModelProperty(value = "")
  public Double getMarginRight() {
    return marginRight;
  }

  public void setMarginRight(Double marginRight) {
    this.marginRight = marginRight;
  }

  public Paragraph spaceBefore(Double spaceBefore) {
    this.spaceBefore = spaceBefore;
    return this;
  }

   /**
   * Get spaceBefore
   * @return spaceBefore
  **/
  @ApiModelProperty(value = "")
  public Double getSpaceBefore() {
    return spaceBefore;
  }

  public void setSpaceBefore(Double spaceBefore) {
    this.spaceBefore = spaceBefore;
  }

  public Paragraph spaceAfter(Double spaceAfter) {
    this.spaceAfter = spaceAfter;
    return this;
  }

   /**
   * Get spaceAfter
   * @return spaceAfter
  **/
  @ApiModelProperty(value = "")
  public Double getSpaceAfter() {
    return spaceAfter;
  }

  public void setSpaceAfter(Double spaceAfter) {
    this.spaceAfter = spaceAfter;
  }

  public Paragraph spaceWithin(Double spaceWithin) {
    this.spaceWithin = spaceWithin;
    return this;
  }

   /**
   * Get spaceWithin
   * @return spaceWithin
  **/
  @ApiModelProperty(value = "")
  public Double getSpaceWithin() {
    return spaceWithin;
  }

  public void setSpaceWithin(Double spaceWithin) {
    this.spaceWithin = spaceWithin;
  }

  public Paragraph indent(Double indent) {
    this.indent = indent;
    return this;
  }

   /**
   * Get indent
   * @return indent
  **/
  @ApiModelProperty(value = "")
  public Double getIndent() {
    return indent;
  }

  public void setIndent(Double indent) {
    this.indent = indent;
  }

  public Paragraph alignment(AlignmentEnum alignment) {
    this.alignment = alignment;
    return this;
  }

   /**
   * Get alignment
   * @return alignment
  **/
  @ApiModelProperty(value = "")
  public AlignmentEnum getAlignment() {
    return alignment;
  }

  public void setAlignment(AlignmentEnum alignment) {
    this.alignment = alignment;
  }

  public Paragraph fontAlignment(FontAlignmentEnum fontAlignment) {
    this.fontAlignment = fontAlignment;
    return this;
  }

   /**
   * Get fontAlignment
   * @return fontAlignment
  **/
  @ApiModelProperty(value = "")
  public FontAlignmentEnum getFontAlignment() {
    return fontAlignment;
  }

  public void setFontAlignment(FontAlignmentEnum fontAlignment) {
    this.fontAlignment = fontAlignment;
  }

  public Paragraph defaultTabSize(Double defaultTabSize) {
    this.defaultTabSize = defaultTabSize;
    return this;
  }

   /**
   * Get defaultTabSize
   * @return defaultTabSize
  **/
  @ApiModelProperty(value = "")
  public Double getDefaultTabSize() {
    return defaultTabSize;
  }

  public void setDefaultTabSize(Double defaultTabSize) {
    this.defaultTabSize = defaultTabSize;
  }

  public Paragraph depth(Integer depth) {
    this.depth = depth;
    return this;
  }

   /**
   * Get depth
   * @return depth
  **/
  @ApiModelProperty(value = "")
  public Integer getDepth() {
    return depth;
  }

  public void setDepth(Integer depth) {
    this.depth = depth;
  }

  public Paragraph bulletChar(String bulletChar) {
    this.bulletChar = bulletChar;
    return this;
  }

   /**
   * Get bulletChar
   * @return bulletChar
  **/
  @ApiModelProperty(value = "")
  public String getBulletChar() {
    return bulletChar;
  }

  public void setBulletChar(String bulletChar) {
    this.bulletChar = bulletChar;
  }

  public Paragraph bulletHeight(Double bulletHeight) {
    this.bulletHeight = bulletHeight;
    return this;
  }

   /**
   * Get bulletHeight
   * @return bulletHeight
  **/
  @ApiModelProperty(value = "")
  public Double getBulletHeight() {
    return bulletHeight;
  }

  public void setBulletHeight(Double bulletHeight) {
    this.bulletHeight = bulletHeight;
  }

  public Paragraph bulletType(BulletTypeEnum bulletType) {
    this.bulletType = bulletType;
    return this;
  }

   /**
   * Get bulletType
   * @return bulletType
  **/
  @ApiModelProperty(value = "")
  public BulletTypeEnum getBulletType() {
    return bulletType;
  }

  public void setBulletType(BulletTypeEnum bulletType) {
    this.bulletType = bulletType;
  }

  public Paragraph numberedBulletStartWith(Integer numberedBulletStartWith) {
    this.numberedBulletStartWith = numberedBulletStartWith;
    return this;
  }

   /**
   * Get numberedBulletStartWith
   * @return numberedBulletStartWith
  **/
  @ApiModelProperty(value = "")
  public Integer getNumberedBulletStartWith() {
    return numberedBulletStartWith;
  }

  public void setNumberedBulletStartWith(Integer numberedBulletStartWith) {
    this.numberedBulletStartWith = numberedBulletStartWith;
  }

  public Paragraph numberedBulletStyle(NumberedBulletStyleEnum numberedBulletStyle) {
    this.numberedBulletStyle = numberedBulletStyle;
    return this;
  }

   /**
   * Get numberedBulletStyle
   * @return numberedBulletStyle
  **/
  @ApiModelProperty(value = "")
  public NumberedBulletStyleEnum getNumberedBulletStyle() {
    return numberedBulletStyle;
  }

  public void setNumberedBulletStyle(NumberedBulletStyleEnum numberedBulletStyle) {
    this.numberedBulletStyle = numberedBulletStyle;
  }

  public Paragraph hangingPunctuation(HangingPunctuationEnum hangingPunctuation) {
    this.hangingPunctuation = hangingPunctuation;
    return this;
  }

   /**
   * Get hangingPunctuation
   * @return hangingPunctuation
  **/
  @ApiModelProperty(value = "")
  public HangingPunctuationEnum getHangingPunctuation() {
    return hangingPunctuation;
  }

  public void setHangingPunctuation(HangingPunctuationEnum hangingPunctuation) {
    this.hangingPunctuation = hangingPunctuation;
  }

  public Paragraph eastAsianLineBreak(EastAsianLineBreakEnum eastAsianLineBreak) {
    this.eastAsianLineBreak = eastAsianLineBreak;
    return this;
  }

   /**
   * Get eastAsianLineBreak
   * @return eastAsianLineBreak
  **/
  @ApiModelProperty(value = "")
  public EastAsianLineBreakEnum getEastAsianLineBreak() {
    return eastAsianLineBreak;
  }

  public void setEastAsianLineBreak(EastAsianLineBreakEnum eastAsianLineBreak) {
    this.eastAsianLineBreak = eastAsianLineBreak;
  }

  public Paragraph latinLineBreak(LatinLineBreakEnum latinLineBreak) {
    this.latinLineBreak = latinLineBreak;
    return this;
  }

   /**
   * Get latinLineBreak
   * @return latinLineBreak
  **/
  @ApiModelProperty(value = "")
  public LatinLineBreakEnum getLatinLineBreak() {
    return latinLineBreak;
  }

  public void setLatinLineBreak(LatinLineBreakEnum latinLineBreak) {
    this.latinLineBreak = latinLineBreak;
  }

  public Paragraph rightToLeft(RightToLeftEnum rightToLeft) {
    this.rightToLeft = rightToLeft;
    return this;
  }

   /**
   * Get rightToLeft
   * @return rightToLeft
  **/
  @ApiModelProperty(value = "")
  public RightToLeftEnum getRightToLeft() {
    return rightToLeft;
  }

  public void setRightToLeft(RightToLeftEnum rightToLeft) {
    this.rightToLeft = rightToLeft;
  }

  public Paragraph portionList(List<ResourceUriElement> portionList) {
    this.portionList = portionList;
    return this;
  }

  public Paragraph addPortionListItem(ResourceUriElement portionListItem) {
    if (this.portionList == null) {
      this.portionList = new ArrayList<ResourceUriElement>();
    }
    this.portionList.add(portionListItem);
    return this;
  }

   /**
   * Get portionList
   * @return portionList
  **/
  @ApiModelProperty(value = "")
  public List<ResourceUriElement> getPortionList() {
    return portionList;
  }

  public void setPortionList(List<ResourceUriElement> portionList) {
    this.portionList = portionList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Paragraph paragraph = (Paragraph) o;
    return true && Objects.equals(this.marginLeft, paragraph.marginLeft) && Objects.equals(this.marginRight, paragraph.marginRight) && Objects.equals(this.spaceBefore, paragraph.spaceBefore) && Objects.equals(this.spaceAfter, paragraph.spaceAfter) && Objects.equals(this.spaceWithin, paragraph.spaceWithin) && Objects.equals(this.indent, paragraph.indent) && Objects.equals(this.alignment, paragraph.alignment) && Objects.equals(this.fontAlignment, paragraph.fontAlignment) && Objects.equals(this.defaultTabSize, paragraph.defaultTabSize) && Objects.equals(this.depth, paragraph.depth) && Objects.equals(this.bulletChar, paragraph.bulletChar) && Objects.equals(this.bulletHeight, paragraph.bulletHeight) && Objects.equals(this.bulletType, paragraph.bulletType) && Objects.equals(this.numberedBulletStartWith, paragraph.numberedBulletStartWith) && Objects.equals(this.numberedBulletStyle, paragraph.numberedBulletStyle) && Objects.equals(this.hangingPunctuation, paragraph.hangingPunctuation) && Objects.equals(this.eastAsianLineBreak, paragraph.eastAsianLineBreak) && Objects.equals(this.latinLineBreak, paragraph.latinLineBreak) && Objects.equals(this.rightToLeft, paragraph.rightToLeft) && Objects.equals(this.portionList, paragraph.portionList) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marginLeft, marginRight, spaceBefore, spaceAfter, spaceWithin, indent, alignment, fontAlignment, defaultTabSize, depth, bulletChar, bulletHeight, bulletType, numberedBulletStartWith, numberedBulletStyle, hangingPunctuation, eastAsianLineBreak, latinLineBreak, rightToLeft, portionList, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Paragraph {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    marginLeft: ").append(toIndentedString(marginLeft)).append("\n");
    sb.append("    marginRight: ").append(toIndentedString(marginRight)).append("\n");
    sb.append("    spaceBefore: ").append(toIndentedString(spaceBefore)).append("\n");
    sb.append("    spaceAfter: ").append(toIndentedString(spaceAfter)).append("\n");
    sb.append("    spaceWithin: ").append(toIndentedString(spaceWithin)).append("\n");
    sb.append("    indent: ").append(toIndentedString(indent)).append("\n");
    sb.append("    alignment: ").append(toIndentedString(alignment)).append("\n");
    sb.append("    fontAlignment: ").append(toIndentedString(fontAlignment)).append("\n");
    sb.append("    defaultTabSize: ").append(toIndentedString(defaultTabSize)).append("\n");
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
    sb.append("    bulletChar: ").append(toIndentedString(bulletChar)).append("\n");
    sb.append("    bulletHeight: ").append(toIndentedString(bulletHeight)).append("\n");
    sb.append("    bulletType: ").append(toIndentedString(bulletType)).append("\n");
    sb.append("    numberedBulletStartWith: ").append(toIndentedString(numberedBulletStartWith)).append("\n");
    sb.append("    numberedBulletStyle: ").append(toIndentedString(numberedBulletStyle)).append("\n");
    sb.append("    hangingPunctuation: ").append(toIndentedString(hangingPunctuation)).append("\n");
    sb.append("    eastAsianLineBreak: ").append(toIndentedString(eastAsianLineBreak)).append("\n");
    sb.append("    latinLineBreak: ").append(toIndentedString(latinLineBreak)).append("\n");
    sb.append("    rightToLeft: ").append(toIndentedString(rightToLeft)).append("\n");
    sb.append("    portionList: ").append(toIndentedString(portionList)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

