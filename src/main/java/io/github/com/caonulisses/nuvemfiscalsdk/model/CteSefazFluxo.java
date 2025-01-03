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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import io.github.com.caonulisses.nuvemfiscalsdk.model.CteSefazPass;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * Previsão do fluxo da carga.  Preenchimento obrigatório para o modal aéreo.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class CteSefazFluxo {
  public static final String SERIALIZED_NAME_X_ORIG = "xOrig";
  @SerializedName(SERIALIZED_NAME_X_ORIG)
  @javax.annotation.Nullable
  private String xOrig;

  public static final String SERIALIZED_NAME_PASS = "pass";
  @SerializedName(SERIALIZED_NAME_PASS)
  @javax.annotation.Nullable
  private List<CteSefazPass> pass = new ArrayList<>();

  public static final String SERIALIZED_NAME_X_DEST = "xDest";
  @SerializedName(SERIALIZED_NAME_X_DEST)
  @javax.annotation.Nullable
  private String xDest;

  public static final String SERIALIZED_NAME_X_ROTA = "xRota";
  @SerializedName(SERIALIZED_NAME_X_ROTA)
  @javax.annotation.Nullable
  private String xRota;

  public CteSefazFluxo() {
  }

  public CteSefazFluxo xOrig(@javax.annotation.Nullable String xOrig) {
    this.xOrig = xOrig;
    return this;
  }

  /**
   * Sigla ou código interno da Filial/Porto/Estação/ Aeroporto de Origem.  Observações para o modal aéreo:  * Preenchimento obrigatório para o modal aéreo.
   * @return xOrig
   */
  @javax.annotation.Nullable
  public String getxOrig() {
    return xOrig;
  }

  public void setxOrig(@javax.annotation.Nullable String xOrig) {
    this.xOrig = xOrig;
  }


  public CteSefazFluxo pass(@javax.annotation.Nullable List<CteSefazPass> pass) {
    this.pass = pass;
    return this;
  }

  public CteSefazFluxo addPassItem(CteSefazPass passItem) {
    if (this.pass == null) {
      this.pass = new ArrayList<>();
    }
    this.pass.add(passItem);
    return this;
  }

  /**
   * Get pass
   * @return pass
   */
  @javax.annotation.Nullable
  public List<CteSefazPass> getPass() {
    return pass;
  }

  public void setPass(@javax.annotation.Nullable List<CteSefazPass> pass) {
    this.pass = pass;
  }


  public CteSefazFluxo xDest(@javax.annotation.Nullable String xDest) {
    this.xDest = xDest;
    return this;
  }

  /**
   * Sigla ou código interno da Filial/Porto/Estação/Aeroporto de Destino.  Observações para o modal aéreo:  * Preenchimento obrigatório para o modal aéreo.
   * @return xDest
   */
  @javax.annotation.Nullable
  public String getxDest() {
    return xDest;
  }

  public void setxDest(@javax.annotation.Nullable String xDest) {
    this.xDest = xDest;
  }


  public CteSefazFluxo xRota(@javax.annotation.Nullable String xRota) {
    this.xRota = xRota;
    return this;
  }

  /**
   * Código da Rota de Entrega.
   * @return xRota
   */
  @javax.annotation.Nullable
  public String getxRota() {
    return xRota;
  }

  public void setxRota(@javax.annotation.Nullable String xRota) {
    this.xRota = xRota;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CteSefazFluxo cteSefazFluxo = (CteSefazFluxo) o;
    return Objects.equals(this.xOrig, cteSefazFluxo.xOrig) &&
        Objects.equals(this.pass, cteSefazFluxo.pass) &&
        Objects.equals(this.xDest, cteSefazFluxo.xDest) &&
        Objects.equals(this.xRota, cteSefazFluxo.xRota);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(xOrig, pass, xDest, xRota);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CteSefazFluxo {\n");
    sb.append("    xOrig: ").append(toIndentedString(xOrig)).append("\n");
    sb.append("    pass: ").append(toIndentedString(pass)).append("\n");
    sb.append("    xDest: ").append(toIndentedString(xDest)).append("\n");
    sb.append("    xRota: ").append(toIndentedString(xRota)).append("\n");
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
    openapiFields.add("xOrig");
    openapiFields.add("pass");
    openapiFields.add("xDest");
    openapiFields.add("xRota");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CteSefazFluxo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CteSefazFluxo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CteSefazFluxo is not found in the empty JSON string", CteSefazFluxo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CteSefazFluxo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CteSefazFluxo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("xOrig") != null && !jsonObj.get("xOrig").isJsonNull()) && !jsonObj.get("xOrig").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `xOrig` to be a primitive type in the JSON string but got `%s`", jsonObj.get("xOrig").toString()));
      }
      if (jsonObj.get("pass") != null && !jsonObj.get("pass").isJsonNull()) {
        JsonArray jsonArraypass = jsonObj.getAsJsonArray("pass");
        if (jsonArraypass != null) {
          // ensure the json data is an array
          if (!jsonObj.get("pass").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `pass` to be an array in the JSON string but got `%s`", jsonObj.get("pass").toString()));
          }

          // validate the optional field `pass` (array)
          for (int i = 0; i < jsonArraypass.size(); i++) {
            CteSefazPass.validateJsonElement(jsonArraypass.get(i));
          };
        }
      }
      if ((jsonObj.get("xDest") != null && !jsonObj.get("xDest").isJsonNull()) && !jsonObj.get("xDest").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `xDest` to be a primitive type in the JSON string but got `%s`", jsonObj.get("xDest").toString()));
      }
      if ((jsonObj.get("xRota") != null && !jsonObj.get("xRota").isJsonNull()) && !jsonObj.get("xRota").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `xRota` to be a primitive type in the JSON string but got `%s`", jsonObj.get("xRota").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CteSefazFluxo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CteSefazFluxo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CteSefazFluxo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CteSefazFluxo.class));

       return (TypeAdapter<T>) new TypeAdapter<CteSefazFluxo>() {
           @Override
           public void write(JsonWriter out, CteSefazFluxo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CteSefazFluxo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CteSefazFluxo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CteSefazFluxo
   * @throws IOException if the JSON string is invalid with respect to CteSefazFluxo
   */
  public static CteSefazFluxo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CteSefazFluxo.class);
  }

  /**
   * Convert an instance of CteSefazFluxo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

