/** OpenAPI Petstore
  * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
  *
  * The version of the OpenAPI document: 1.0.0
  * Contact: team@openapitools.org
  *
  * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
  * https://openapi-generator.tech
  * Do not edit the class manually.
  */
package org.openapitools.client.models

import io.circe.*
import io.circe.syntax.*
import io.circe.{Decoder, Encoder}


/** Order Status
  */
enum OrderStatus(val value: String) {
  case Placed extends OrderStatus("placed")
  case Approved extends OrderStatus("approved")
  case Delivered extends OrderStatus("delivered")
}

object OrderStatus {

  def withValueOpt(value: String): Option[OrderStatus] = OrderStatus.values.find(_.value == value)
  def withValue(value: String): OrderStatus =
    withValueOpt(value).getOrElse(throw java.lang.IllegalArgumentException(s"OrderStatus enum case not found: $value"))

  given decoderOrderStatus: Decoder[OrderStatus] = Decoder.decodeString.map(withValue)
  given encoderOrderStatus: Encoder[OrderStatus] = Encoder.encodeString.contramap[OrderStatus](_.value)

}

