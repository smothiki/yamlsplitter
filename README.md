# yamlsplitter

Splits the yaml file according to the delimeter and treat the next line to delimeter as the file name

sample file 
```

#---#
#docker-compose-qa.yml

version: '2'

#Jacoco data volume
volumes:
  jacoco:
    driver: local

services:

--------
     
#---#
#docker-compose-ha.yml

-----
-----
```

craetes two files docker-compose-ha.yml and docker-compose-qa.yml
