import  suds

url = 'http://webservice.webxml.com.cn/Webservices/MobileCodeWS.asmx?wsdl'

client=suds.client.Client(url)

result = client.service.getMobileCodeInfo(123123123123)

print result