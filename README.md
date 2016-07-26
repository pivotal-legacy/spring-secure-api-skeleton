# Spring Secure API Skeleton

``` bash
# 401 Unauthorized
curl -i http://localhost:8080/

# 200 OK
# X-AUTH-TOKEN: b912ddc1-e9b5-46f0-8b19-70bad5d21803
curl -i http://localhost:8080/ -u user:password

# 200 OK
curl -i http://localhost:8080/ -H "X-AUTH-TOKEN: b912ddc1-e9b5-46f0-8b19-70bad5d21803"
```
