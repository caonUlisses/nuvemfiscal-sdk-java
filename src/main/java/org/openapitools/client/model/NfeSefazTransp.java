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


package org.openapitools.client.model;

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
import org.openapitools.client.model.NfeSefazRetTransp;
import org.openapitools.client.model.NfeSefazTransporta;
import org.openapitools.client.model.NfeSefazVeiculo;
import org.openapitools.client.model.NfeSefazVol;
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

import org.openapitools.client.JSON;

/**
 * Dados dos transportes da NF-e.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class NfeSefazTransp {
  public static final String SERIALIZED_NAME_MOD_FRETE = "modFrete";
  @SerializedName(SERIALIZED_NAME_MOD_FRETE)
  @javax.annotation.Nullable
  private Integer modFrete;

  public static final String SERIALIZED_NAME_TRANSPORTA = "transporta";
  @SerializedName(SERIALIZED_NAME_TRANSPORTA)
  @javax.annotation.Nullable
  private NfeSefazTransporta transporta;

  public static final String SERIALIZED_NAME_RET_TRANSP = "retTransp";
  @SerializedName(SERIALIZED_NAME_RET_TRANSP)
  @javax.annotation.Nullable
  private NfeSefazRetTransp retTransp;

  public static final String SERIALIZED_NAME_VEIC_TRANSP = "veicTransp";
  @SerializedName(SERIALIZED_NAME_VEIC_TRANSP)
  @javax.annotation.Nullable
  private NfeSefazVeiculo veicTransp;

  public static final String SERIALIZED_NAME_REBOQUE = "reboque";
  @SerializedName(SERIALIZED_NAME_REBOQUE)
  @javax.annotation.Nullable
  private List<NfeSefazVeiculo> reboque = new ArrayList<>();

  public static final String SERIALIZED_NAME_VAGAO = "vagao";
  @SerializedName(SERIALIZED_NAME_VAGAO)
  @javax.annotation.Nullable
  private String vagao;

  public static final String SERIALIZED_NAME_BALSA = "balsa";
  @SerializedName(SERIALIZED_NAME_BALSA)
  @javax.annotation.Nullable
  private String balsa;

  public static final String SERIALIZED_NAME_VOL = "vol";
  @SerializedName(SERIALIZED_NAME_VOL)
  @javax.annotation.Nullable
  private List<NfeSefazVol> vol = new ArrayList<>();

  public NfeSefazTransp() {
  }

  public NfeSefazTransp modFrete(@javax.annotation.Nullable Integer modFrete) {
    this.modFrete = modFrete;
    return this;
  }

  /**
   * Modalidade do frete  * 0 - Contratação do Frete por conta do Remetente (CIF)  * 1 - Contratação do Frete por conta do destinatário/remetente (FOB)  * 2 - Contratação do Frete por conta de terceiros  * 3 - Transporte próprio por conta do remetente  * 4 - Transporte próprio por conta do destinatário  * 9 - Sem Ocorrência de transporte
   * @return modFrete
   */
  @javax.annotation.Nullable
  public Integer getModFrete() {
    return modFrete;
  }

  public void setModFrete(@javax.annotation.Nullable Integer modFrete) {
    this.modFrete = modFrete;
  }


  public NfeSefazTransp transporta(@javax.annotation.Nullable NfeSefazTransporta transporta) {
    this.transporta = transporta;
    return this;
  }

  /**
   * Get transporta
   * @return transporta
   */
  @javax.annotation.Nullable
  public NfeSefazTransporta getTransporta() {
    return transporta;
  }

  public void setTransporta(@javax.annotation.Nullable NfeSefazTransporta transporta) {
    this.transporta = transporta;
  }


  public NfeSefazTransp retTransp(@javax.annotation.Nullable NfeSefazRetTransp retTransp) {
    this.retTransp = retTransp;
    return this;
  }

  /**
   * Get retTransp
   * @return retTransp
   */
  @javax.annotation.Nullable
  public NfeSefazRetTransp getRetTransp() {
    return retTransp;
  }

  public void setRetTransp(@javax.annotation.Nullable NfeSefazRetTransp retTransp) {
    this.retTransp = retTransp;
  }


  public NfeSefazTransp veicTransp(@javax.annotation.Nullable NfeSefazVeiculo veicTransp) {
    this.veicTransp = veicTransp;
    return this;
  }

  /**
   * Get veicTransp
   * @return veicTransp
   */
  @javax.annotation.Nullable
  public NfeSefazVeiculo getVeicTransp() {
    return veicTransp;
  }

  public void setVeicTransp(@javax.annotation.Nullable NfeSefazVeiculo veicTransp) {
    this.veicTransp = veicTransp;
  }


  public NfeSefazTransp reboque(@javax.annotation.Nullable List<NfeSefazVeiculo> reboque) {
    this.reboque = reboque;
    return this;
  }

  public NfeSefazTransp addReboqueItem(NfeSefazVeiculo reboqueItem) {
    if (this.reboque == null) {
      this.reboque = new ArrayList<>();
    }
    this.reboque.add(reboqueItem);
    return this;
  }

  /**
   * Get reboque
   * @return reboque
   */
  @javax.annotation.Nullable
  public List<NfeSefazVeiculo> getReboque() {
    return reboque;
  }

  public void setReboque(@javax.annotation.Nullable List<NfeSefazVeiculo> reboque) {
    this.reboque = reboque;
  }


  public NfeSefazTransp vagao(@javax.annotation.Nullable String vagao) {
    this.vagao = vagao;
    return this;
  }

  /**
   * Identificação do vagão (v2.0).
   * @return vagao
   */
  @javax.annotation.Nullable
  public String getVagao() {
    return vagao;
  }

  public void setVagao(@javax.annotation.Nullable String vagao) {
    this.vagao = vagao;
  }


  public NfeSefazTransp balsa(@javax.annotation.Nullable String balsa) {
    this.balsa = balsa;
    return this;
  }

  /**
   * Identificação da balsa (v2.0).
   * @return balsa
   */
  @javax.annotation.Nullable
  public String getBalsa() {
    return balsa;
  }

  public void setBalsa(@javax.annotation.Nullable String balsa) {
    this.balsa = balsa;
  }


  public NfeSefazTransp vol(@javax.annotation.Nullable List<NfeSefazVol> vol) {
    this.vol = vol;
    return this;
  }

  public NfeSefazTransp addVolItem(NfeSefazVol volItem) {
    if (this.vol == null) {
      this.vol = new ArrayList<>();
    }
    this.vol.add(volItem);
    return this;
  }

  /**
   * Get vol
   * @return vol
   */
  @javax.annotation.Nullable
  public List<NfeSefazVol> getVol() {
    return vol;
  }

  public void setVol(@javax.annotation.Nullable List<NfeSefazVol> vol) {
    this.vol = vol;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NfeSefazTransp nfeSefazTransp = (NfeSefazTransp) o;
    return Objects.equals(this.modFrete, nfeSefazTransp.modFrete) &&
        Objects.equals(this.transporta, nfeSefazTransp.transporta) &&
        Objects.equals(this.retTransp, nfeSefazTransp.retTransp) &&
        Objects.equals(this.veicTransp, nfeSefazTransp.veicTransp) &&
        Objects.equals(this.reboque, nfeSefazTransp.reboque) &&
        Objects.equals(this.vagao, nfeSefazTransp.vagao) &&
        Objects.equals(this.balsa, nfeSefazTransp.balsa) &&
        Objects.equals(this.vol, nfeSefazTransp.vol);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(modFrete, transporta, retTransp, veicTransp, reboque, vagao, balsa, vol);
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
    sb.append("class NfeSefazTransp {\n");
    sb.append("    modFrete: ").append(toIndentedString(modFrete)).append("\n");
    sb.append("    transporta: ").append(toIndentedString(transporta)).append("\n");
    sb.append("    retTransp: ").append(toIndentedString(retTransp)).append("\n");
    sb.append("    veicTransp: ").append(toIndentedString(veicTransp)).append("\n");
    sb.append("    reboque: ").append(toIndentedString(reboque)).append("\n");
    sb.append("    vagao: ").append(toIndentedString(vagao)).append("\n");
    sb.append("    balsa: ").append(toIndentedString(balsa)).append("\n");
    sb.append("    vol: ").append(toIndentedString(vol)).append("\n");
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
    openapiFields.add("modFrete");
    openapiFields.add("transporta");
    openapiFields.add("retTransp");
    openapiFields.add("veicTransp");
    openapiFields.add("reboque");
    openapiFields.add("vagao");
    openapiFields.add("balsa");
    openapiFields.add("vol");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("modFrete");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NfeSefazTransp
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NfeSefazTransp.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NfeSefazTransp is not found in the empty JSON string", NfeSefazTransp.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NfeSefazTransp.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NfeSefazTransp` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NfeSefazTransp.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `transporta`
      if (jsonObj.get("transporta") != null && !jsonObj.get("transporta").isJsonNull()) {
        NfeSefazTransporta.validateJsonElement(jsonObj.get("transporta"));
      }
      // validate the optional field `retTransp`
      if (jsonObj.get("retTransp") != null && !jsonObj.get("retTransp").isJsonNull()) {
        NfeSefazRetTransp.validateJsonElement(jsonObj.get("retTransp"));
      }
      // validate the optional field `veicTransp`
      if (jsonObj.get("veicTransp") != null && !jsonObj.get("veicTransp").isJsonNull()) {
        NfeSefazVeiculo.validateJsonElement(jsonObj.get("veicTransp"));
      }
      if (jsonObj.get("reboque") != null && !jsonObj.get("reboque").isJsonNull()) {
        JsonArray jsonArrayreboque = jsonObj.getAsJsonArray("reboque");
        if (jsonArrayreboque != null) {
          // ensure the json data is an array
          if (!jsonObj.get("reboque").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `reboque` to be an array in the JSON string but got `%s`", jsonObj.get("reboque").toString()));
          }

          // validate the optional field `reboque` (array)
          for (int i = 0; i < jsonArrayreboque.size(); i++) {
            NfeSefazVeiculo.validateJsonElement(jsonArrayreboque.get(i));
          };
        }
      }
      if ((jsonObj.get("vagao") != null && !jsonObj.get("vagao").isJsonNull()) && !jsonObj.get("vagao").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vagao` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vagao").toString()));
      }
      if ((jsonObj.get("balsa") != null && !jsonObj.get("balsa").isJsonNull()) && !jsonObj.get("balsa").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `balsa` to be a primitive type in the JSON string but got `%s`", jsonObj.get("balsa").toString()));
      }
      if (jsonObj.get("vol") != null && !jsonObj.get("vol").isJsonNull()) {
        JsonArray jsonArrayvol = jsonObj.getAsJsonArray("vol");
        if (jsonArrayvol != null) {
          // ensure the json data is an array
          if (!jsonObj.get("vol").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `vol` to be an array in the JSON string but got `%s`", jsonObj.get("vol").toString()));
          }

          // validate the optional field `vol` (array)
          for (int i = 0; i < jsonArrayvol.size(); i++) {
            NfeSefazVol.validateJsonElement(jsonArrayvol.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NfeSefazTransp.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NfeSefazTransp' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NfeSefazTransp> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NfeSefazTransp.class));

       return (TypeAdapter<T>) new TypeAdapter<NfeSefazTransp>() {
           @Override
           public void write(JsonWriter out, NfeSefazTransp value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NfeSefazTransp read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NfeSefazTransp given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NfeSefazTransp
   * @throws IOException if the JSON string is invalid with respect to NfeSefazTransp
   */
  public static NfeSefazTransp fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NfeSefazTransp.class);
  }

  /**
   * Convert an instance of NfeSefazTransp to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
