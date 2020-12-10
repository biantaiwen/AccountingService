# accounting-service

## docker run mysql

// serverTimezone=Asia/Shanghai
```shell
docker run --name my-mysql -p 3306:3306 -v `pwd`/db/mysql:/var/lib/mysql -e MYSQL_ROOT_PASSWORD=root TZ=Asia/Shanghai -d mysql:8.0.22
```

