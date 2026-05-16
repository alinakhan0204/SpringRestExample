# This is a basic project for Job portal.

Using - Spring Boot, REST APIs, Spring Data JPA, MySQL connector

Functionalities you can check using URLs  -

### GET APIs

* Job Search  - http://127.0.0.1:8080/getJobs
* Job Search using Key word - http://127.0.0.1:8080/getJob/keyword/java
* Job Search using Id - http://127.0.0.1:8080/getJob/4

### POST APIs 
* Add Job - http://127.0.0.1:8080/getJob

Add details in body, for example -

```JSON
{
        "postId": 6,
        "postProfile": "iOS Developer",
        "postDesc": "Experience in mobile app development for iOS",
        "reqExperience": 2,
        "postTechStack": [
            "iOS Development",
            "Mobile App"
        ]
}
```

### DELETE APIs 
* To delete profie - http://127.0.0.1:8080/getJob/6
  
Give Id in url for which delete functinality is required. For example Id is 6 in above url.

### PUT APPIs
* To Modify Job Profile - http://127.0.0.1:8080/getJob
  
Give data in body in JSON format.
