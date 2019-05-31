# SpringRestService
Basic Spring REST service demo

Below are the endpoints#
--------------------------------------1st endpoint----------------------------------------------------------
POST:http://localhost:8080/SpringRestService/rest/emp/update/2
Request jSON:
{
    "id":2,
    "firstname":"rambabu",
    "lastname":"gonela",
    "designation":"lead consultant",
    "doj":1559216367912
}
Expected Response:
{
    "id":2,
    "firstname":"rambabu",
    "lastname":"gonela",
    "designation":"lead consultant",
    "doj":1559216367912
}

--------------------------------------2nd endpoint----------------------------------------------------------
GET:http://localhost:8080/SpringRestService/rest/emp/get/1
Expected Response:
{
    "id": 1,
    "firstname": "dushyant",
    "lastname": "sahu",
    "designation": "lead consultant",
    "doj": 1559213433554
}

--------------------------------------3rd endpoint----------------------------------------------------------
GET:http://localhost:8080/SpringRestService/rest/emp/get?id=1
Expected Response:
{
    "id": 1,
    "firstname": "dushyant",
    "lastname": "sahu",
    "designation": "lead consultant",
    "doj": 1559213433554
}
