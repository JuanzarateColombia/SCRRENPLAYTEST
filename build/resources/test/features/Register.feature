
  Feature: Register

  @Register
  Scenario Outline: Register
    Given El cliente abre la pagina web y ingresa a button Join Today
    When   El cliente llena la informacion <firstName>  <lastName>  <email>  <birthMonth>  <birthDay>  <birthYear> <city>  <zip>  <country> <computer>  <version>  <language>  <mobile>  <model>  <operating> <password>  <confirmarpassword> <stay> <termOfUse> <privacySetting>
    Then Permite el registro con el mensaje  <validatexto>

    Examples:
    |firstName|lastName|email|birthMonth|birthDay|birthYear|city|zip|country|computer|version|language|mobile|model|operating|password|confirmarpassword|stay|termOfUse|privacySetting|validatexto|
    |juan carlos|godoy zarate|adioslave@live.com|October|20|1988|Bogota|111951|Colombia|Windows|10|Spanish|Huawei|SmaKit S7|Android 2.5|WindowsColombia10|WindowsColombia10|true|true|true|Welcome to the world's largest community of freelance software testers!|

