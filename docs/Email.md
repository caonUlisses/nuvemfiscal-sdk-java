

# Email


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | ID único gerado pela Nuvem Fiscal para este email.    Utilize-o no endpoint de &lt;a href&#x3D;\&quot;#tag/Email/operation/ConsultarEmail\&quot;&gt;consulta de email&lt;/a&gt;  para obter informações detalhadas sobre o envio do email e  rastrear todos os eventos relacionados, como envio, entrega, falhas e outros  eventos relevantes. |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**sentAt** | **OffsetDateTime** |  |  [optional] |
|**to** | **List&lt;String&gt;** |  |  [optional] |
|**cc** | **List&lt;String&gt;** |  |  [optional] |
|**replyTo** | **String** |  |  [optional] |
|**subject** | **String** |  |  [optional] |
|**attachments** | [**List&lt;EmailAttachment&gt;**](EmailAttachment.md) |  |  [optional] |
|**events** | [**List&lt;EmailEvent&gt;**](EmailEvent.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| SENDING | &quot;sending&quot; |
| SENT | &quot;sent&quot; |
| DELIVERED | &quot;delivered&quot; |
| DELIVERY_DELAYED | &quot;delivery_delayed&quot; |
| BOUNCED | &quot;bounced&quot; |
| COMPLAINED | &quot;complained&quot; |
| REJECTED | &quot;rejected&quot; |
| CANCELLED | &quot;cancelled&quot; |
| FAILED | &quot;failed&quot; |



