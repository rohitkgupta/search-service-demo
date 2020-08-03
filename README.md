#search-service
Project written in Java, SpringBoot and gradle for build.

Steps to build & run:

./gradlew clean build

docker build -t=search-service 

docker run -p 9090:9090 search-service:latest

Check health:
curl http://localhost:9090/search-service/actuator/health

Test service:
curl http://localhost:9090/search-service/search/complete?q=ab

--it will return empty result as nothing search yet. 
As soon as you search something it will add search sting in search term database.

curl http://localhost:9090/search-service/search?q=abcdef
curl http://localhost:9090/search-service/search/complete?q=ab

-- it will give you last searched term in the result