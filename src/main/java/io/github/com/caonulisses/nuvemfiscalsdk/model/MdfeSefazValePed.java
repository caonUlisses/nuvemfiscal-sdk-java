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
import io.github.com.caonulisses.nuvemfiscalsdk.model.MdfeSefazDisp;
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
 * Informações de Vale Pedágio.  Outras informações sobre Vale-Pedágio obrigatório que não tenham campos específicos devem ser informadas no campo de observações gerais de uso livre pelo contribuinte, visando atender as determinações legais vigentes.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class MdfeSefazValePed {
  public static final String SERIALIZED_NAME_DISP = "disp";
  @SerializedName(SERIALIZED_NAME_DISP)
  @javax.annotation.Nonnull
  private List<MdfeSefazDisp> disp = new ArrayList<>();

  public static final String SERIALIZED_NAME_CATEG_COMB_VEIC = "categCombVeic";
  @SerializedName(SERIALIZED_NAME_CATEG_COMB_VEIC)
  @javax.annotation.Nullable
  private String categCombVeic;

  public MdfeSefazValePed() {
  }

  public MdfeSefazValePed disp(@javax.annotation.Nonnull List<MdfeSefazDisp> disp) {
    this.disp = disp;
    return this;
  }

  public MdfeSefazValePed addDispItem(MdfeSefazDisp dispItem) {
    if (this.disp == null) {
      this.disp = new ArrayList<>();
    }
    this.disp.add(dispItem);
    return this;
  }

  /**
   * Get disp
   * @return disp
   */
  @javax.annotation.Nonnull
  public List<MdfeSefazDisp> getDisp() {
    return disp;
  }

  public void setDisp(@javax.annotation.Nonnull List<MdfeSefazDisp> disp) {
    this.disp = disp;
  }


  public MdfeSefazValePed categCombVeic(@javax.annotation.Nullable String categCombVeic) {
    this.categCombVeic = categCombVeic;
    return this;
  }

  /**
   * Categoria de Combinação Veicular.  Preencher com:  02 Veículo Comercial 2 eixos  0  4 Veículo Comercial 3 eixos  06 Veículo Comercial 4 eixos  0  7 Veículo Comercial 5 eixos  0  8 Veículo Comercial 6 eixos  10 Veículo Comercial 7 eixos  11 Veículo Comercial 8 eixos  12 Veículo Comercial 9 eixos  13 Veículo Comercial 10 eixos  14 Veículo Comercial Acima de 10 eixos.
   * @return categCombVeic
   */
  @javax.annotation.Nullable
  public String getCategCombVeic() {
    return categCombVeic;
  }

  public void setCategCombVeic(@javax.annotation.Nullable String categCombVeic) {
    this.categCombVeic = categCombVeic;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MdfeSefazValePed mdfeSefazValePed = (MdfeSefazValePed) o;
    return Objects.equals(this.disp, mdfeSefazValePed.disp) &&
        Objects.equals(this.categCombVeic, mdfeSefazValePed.categCombVeic);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(disp, categCombVeic);
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
    sb.append("class MdfeSefazValePed {\n");
    sb.append("    disp: ").append(toIndentedString(disp)).append("\n");
    sb.append("    categCombVeic: ").append(toIndentedString(categCombVeic)).append("\n");
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
    openapiFields.add("disp");
    openapiFields.add("categCombVeic");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("disp");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MdfeSefazValePed
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MdfeSefazValePed.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MdfeSefazValePed is not found in the empty JSON string", MdfeSefazValePed.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MdfeSefazValePed.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MdfeSefazValePed` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MdfeSefazValePed.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("disp").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `disp` to be an array in the JSON string but got `%s`", jsonObj.get("disp").toString()));
      }

      JsonArray jsonArraydisp = jsonObj.getAsJsonArray("disp");
      // validate the required field `disp` (array)
      for (int i = 0; i < jsonArraydisp.size(); i++) {
        MdfeSefazDisp.validateJsonElement(jsonArraydisp.get(i));
      };
      if ((jsonObj.get("categCombVeic") != null && !jsonObj.get("categCombVeic").isJsonNull()) && !jsonObj.get("categCombVeic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `categCombVeic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("categCombVeic").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MdfeSefazValePed.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MdfeSefazValePed' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MdfeSefazValePed> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MdfeSefazValePed.class));

       return (TypeAdapter<T>) new TypeAdapter<MdfeSefazValePed>() {
           @Override
           public void write(JsonWriter out, MdfeSefazValePed value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MdfeSefazValePed read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of MdfeSefazValePed given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MdfeSefazValePed
   * @throws IOException if the JSON string is invalid with respect to MdfeSefazValePed
   */
  public static MdfeSefazValePed fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MdfeSefazValePed.class);
  }

  /**
   * Convert an instance of MdfeSefazValePed to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

