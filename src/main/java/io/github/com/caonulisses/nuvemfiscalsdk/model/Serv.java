/*
 * API Nuvem Fiscal
 * API para automação comercial e documentos fiscais.
 *
 * The version of the OpenAPI document: 2.44.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.com.caonulisses.nuvemfiscalsdk.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import io.github.com.caonulisses.nuvemfiscalsdk.model.AtvEvento;
import io.github.com.caonulisses.nuvemfiscalsdk.model.CServ;
import io.github.com.caonulisses.nuvemfiscalsdk.model.ComExterior;
import io.github.com.caonulisses.nuvemfiscalsdk.model.ExploracaoRodoviaria;
import io.github.com.caonulisses.nuvemfiscalsdk.model.InfoCompl;
import io.github.com.caonulisses.nuvemfiscalsdk.model.InfoObra;
import io.github.com.caonulisses.nuvemfiscalsdk.model.LocPrest;
import io.github.com.caonulisses.nuvemfiscalsdk.model.LocacaoSublocacao;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.github.com.caonulisses.nuvemfiscalsdk.JSON;

/**
 * Grupo de informações do DPS relativas ao Serviço Prestado.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class Serv {
  public static final String SERIALIZED_NAME_LOC_PREST = "locPrest";
  @SerializedName(SERIALIZED_NAME_LOC_PREST)
  @javax.annotation.Nullable
  private LocPrest locPrest;

  public static final String SERIALIZED_NAME_C_SERV = "cServ";
  @SerializedName(SERIALIZED_NAME_C_SERV)
  @javax.annotation.Nonnull
  private CServ cServ;

  public static final String SERIALIZED_NAME_COM_EXT = "comExt";
  @SerializedName(SERIALIZED_NAME_COM_EXT)
  @javax.annotation.Nullable
  private ComExterior comExt;

  public static final String SERIALIZED_NAME_LSADPPU = "lsadppu";
  @SerializedName(SERIALIZED_NAME_LSADPPU)
  @javax.annotation.Nullable
  private LocacaoSublocacao lsadppu;

  public static final String SERIALIZED_NAME_OBRA = "obra";
  @SerializedName(SERIALIZED_NAME_OBRA)
  @javax.annotation.Nullable
  private InfoObra obra;

  public static final String SERIALIZED_NAME_ATV_EVENTO = "atvEvento";
  @SerializedName(SERIALIZED_NAME_ATV_EVENTO)
  @javax.annotation.Nullable
  private AtvEvento atvEvento;

  public static final String SERIALIZED_NAME_EXPL_ROD = "explRod";
  @SerializedName(SERIALIZED_NAME_EXPL_ROD)
  @javax.annotation.Nullable
  private ExploracaoRodoviaria explRod;

  public static final String SERIALIZED_NAME_INFO_COMPL = "infoCompl";
  @SerializedName(SERIALIZED_NAME_INFO_COMPL)
  @javax.annotation.Nullable
  private InfoCompl infoCompl;

  public Serv() {
  }

  public Serv locPrest(@javax.annotation.Nullable LocPrest locPrest) {
    this.locPrest = locPrest;
    return this;
  }

  /**
   * Get locPrest
   * @return locPrest
   */
  @javax.annotation.Nullable
  public LocPrest getLocPrest() {
    return locPrest;
  }

  public void setLocPrest(@javax.annotation.Nullable LocPrest locPrest) {
    this.locPrest = locPrest;
  }


  public Serv cServ(@javax.annotation.Nonnull CServ cServ) {
    this.cServ = cServ;
    return this;
  }

  /**
   * Get cServ
   * @return cServ
   */
  @javax.annotation.Nonnull
  public CServ getcServ() {
    return cServ;
  }

  public void setcServ(@javax.annotation.Nonnull CServ cServ) {
    this.cServ = cServ;
  }


  public Serv comExt(@javax.annotation.Nullable ComExterior comExt) {
    this.comExt = comExt;
    return this;
  }

  /**
   * Get comExt
   * @return comExt
   */
  @javax.annotation.Nullable
  public ComExterior getComExt() {
    return comExt;
  }

  public void setComExt(@javax.annotation.Nullable ComExterior comExt) {
    this.comExt = comExt;
  }


  public Serv lsadppu(@javax.annotation.Nullable LocacaoSublocacao lsadppu) {
    this.lsadppu = lsadppu;
    return this;
  }

  /**
   * Get lsadppu
   * @return lsadppu
   */
  @javax.annotation.Nullable
  public LocacaoSublocacao getLsadppu() {
    return lsadppu;
  }

  public void setLsadppu(@javax.annotation.Nullable LocacaoSublocacao lsadppu) {
    this.lsadppu = lsadppu;
  }


  public Serv obra(@javax.annotation.Nullable InfoObra obra) {
    this.obra = obra;
    return this;
  }

  /**
   * Get obra
   * @return obra
   */
  @javax.annotation.Nullable
  public InfoObra getObra() {
    return obra;
  }

  public void setObra(@javax.annotation.Nullable InfoObra obra) {
    this.obra = obra;
  }


  public Serv atvEvento(@javax.annotation.Nullable AtvEvento atvEvento) {
    this.atvEvento = atvEvento;
    return this;
  }

  /**
   * Get atvEvento
   * @return atvEvento
   */
  @javax.annotation.Nullable
  public AtvEvento getAtvEvento() {
    return atvEvento;
  }

  public void setAtvEvento(@javax.annotation.Nullable AtvEvento atvEvento) {
    this.atvEvento = atvEvento;
  }


  public Serv explRod(@javax.annotation.Nullable ExploracaoRodoviaria explRod) {
    this.explRod = explRod;
    return this;
  }

  /**
   * Get explRod
   * @return explRod
   */
  @javax.annotation.Nullable
  public ExploracaoRodoviaria getExplRod() {
    return explRod;
  }

  public void setExplRod(@javax.annotation.Nullable ExploracaoRodoviaria explRod) {
    this.explRod = explRod;
  }


  public Serv infoCompl(@javax.annotation.Nullable InfoCompl infoCompl) {
    this.infoCompl = infoCompl;
    return this;
  }

  /**
   * Get infoCompl
   * @return infoCompl
   */
  @javax.annotation.Nullable
  public InfoCompl getInfoCompl() {
    return infoCompl;
  }

  public void setInfoCompl(@javax.annotation.Nullable InfoCompl infoCompl) {
    this.infoCompl = infoCompl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Serv serv = (Serv) o;
    return Objects.equals(this.locPrest, serv.locPrest) &&
        Objects.equals(this.cServ, serv.cServ) &&
        Objects.equals(this.comExt, serv.comExt) &&
        Objects.equals(this.lsadppu, serv.lsadppu) &&
        Objects.equals(this.obra, serv.obra) &&
        Objects.equals(this.atvEvento, serv.atvEvento) &&
        Objects.equals(this.explRod, serv.explRod) &&
        Objects.equals(this.infoCompl, serv.infoCompl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locPrest, cServ, comExt, lsadppu, obra, atvEvento, explRod, infoCompl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Serv {\n");
    sb.append("    locPrest: ").append(toIndentedString(locPrest)).append("\n");
    sb.append("    cServ: ").append(toIndentedString(cServ)).append("\n");
    sb.append("    comExt: ").append(toIndentedString(comExt)).append("\n");
    sb.append("    lsadppu: ").append(toIndentedString(lsadppu)).append("\n");
    sb.append("    obra: ").append(toIndentedString(obra)).append("\n");
    sb.append("    atvEvento: ").append(toIndentedString(atvEvento)).append("\n");
    sb.append("    explRod: ").append(toIndentedString(explRod)).append("\n");
    sb.append("    infoCompl: ").append(toIndentedString(infoCompl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("locPrest");
    openapiFields.add("cServ");
    openapiFields.add("comExt");
    openapiFields.add("lsadppu");
    openapiFields.add("obra");
    openapiFields.add("atvEvento");
    openapiFields.add("explRod");
    openapiFields.add("infoCompl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cServ");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Serv
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Serv.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Serv is not found in the empty JSON string", Serv.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Serv.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Serv` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Serv.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `locPrest`
      if (jsonObj.get("locPrest") != null && !jsonObj.get("locPrest").isJsonNull()) {
        LocPrest.validateJsonElement(jsonObj.get("locPrest"));
      }
      // validate the required field `cServ`
      CServ.validateJsonElement(jsonObj.get("cServ"));
      // validate the optional field `comExt`
      if (jsonObj.get("comExt") != null && !jsonObj.get("comExt").isJsonNull()) {
        ComExterior.validateJsonElement(jsonObj.get("comExt"));
      }
      // validate the optional field `lsadppu`
      if (jsonObj.get("lsadppu") != null && !jsonObj.get("lsadppu").isJsonNull()) {
        LocacaoSublocacao.validateJsonElement(jsonObj.get("lsadppu"));
      }
      // validate the optional field `obra`
      if (jsonObj.get("obra") != null && !jsonObj.get("obra").isJsonNull()) {
        InfoObra.validateJsonElement(jsonObj.get("obra"));
      }
      // validate the optional field `atvEvento`
      if (jsonObj.get("atvEvento") != null && !jsonObj.get("atvEvento").isJsonNull()) {
        AtvEvento.validateJsonElement(jsonObj.get("atvEvento"));
      }
      // validate the optional field `explRod`
      if (jsonObj.get("explRod") != null && !jsonObj.get("explRod").isJsonNull()) {
        ExploracaoRodoviaria.validateJsonElement(jsonObj.get("explRod"));
      }
      // validate the optional field `infoCompl`
      if (jsonObj.get("infoCompl") != null && !jsonObj.get("infoCompl").isJsonNull()) {
        InfoCompl.validateJsonElement(jsonObj.get("infoCompl"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Serv.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Serv' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Serv> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Serv.class));

       return (TypeAdapter<T>) new TypeAdapter<Serv>() {
           @Override
           public void write(JsonWriter out, Serv value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Serv read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Serv given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Serv
   * @throws IOException if the JSON string is invalid with respect to Serv
   */
  public static Serv fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Serv.class);
  }

  /**
   * Convert an instance of Serv to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
