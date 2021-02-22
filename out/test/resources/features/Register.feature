
  Feature: Register

  @Register

  Scenario Outline: Register
    Given El cliente abre la pagina web y ingresa a button "Join Today"
    When   El cliente llena la informacion paso uno <firstName>  <lastName>  <email>  <birthMonth>  <birthDay>  <birthYear>
    And llena la  informacion paso dos <City>  <Zip>  <Country>  <mes>  <dia>  <ano>
    And llena la informacion paso tres <Computer>  <Version>  <Language>  <Mobile>  <Model>  <Operating>
    And llena  la informacion paso cuatro <password>  <confirmarpassword>
    Then Permite el registro con el mensaje  <validatexto>

    Examples:
    |firstName|lastName|email|birthMonth|birthDay|birthYear|City|Zip|Country|Computer|Version|Language|Mobile|Model|Operating|password|confirmarpassword|validatexto|
    |juan carlos|godoy zarate|adioslave@live.com|octuber|20|1988|Bogota|111951|Colombia|Windows|10|Spanish|Huawei|SmaKit S7|Android 2.5|WindowsColombia10|WindowsColombia10|Spanish|

