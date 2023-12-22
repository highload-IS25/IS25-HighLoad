redis-cli --cluster create redis-master-a:6999 redis-master-b:7001 redis-master-c:7002 --cluster-yes -a 123456

redis-cli --cluster add-node redis-replica-a:7003 redis-master-a:6999 --cluster-slave -a 123456
redis-cli --cluster add-node redis-replica-b:7004 redis-master-b:7001 --cluster-slave -a 123456
redis-cli --cluster add-node redis-replica-c:7005 redis-master-c:7002 --cluster-slave -a 123456
