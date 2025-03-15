# 🕸🌆 System Design Fundamentals & Deep Dive🏗🚧

This repository serves as a comprehensive guide to system design principles, covering essential concepts, metrics, and
practical examples. Whether you're preparing for technical interviews or building scalable applications, this resource
will equip you with the knowledge you need.

## 1️⃣ Fundamentals of System Design

### Key Concepts

- ✅ **Scalability (Vertical vs. Horizontal):** Understanding how to grow your system to handle increased load.
- ✅ **High Availability & Fault Tolerance:** Ensuring your system remains operational even when components fail.
- ✅ **Consistency, Availability, Partition Tolerance (CAP Theorem):** Navigating the trade-offs in distributed systems.
- ✅ **Latency vs. Throughput:** Distinguishing between response time and processing capacity.
- ✅ **Load Balancing:** Distributing traffic efficiently across multiple servers.

### Important Metrics

- 🔹 **Response Time (P50, P95, P99 latency):** Measuring the time it takes for requests to be processed.
- 🔹 **Requests per second (RPS/QPS):** Tracking the number of requests your system can handle.
- 🔹 **System Uptime (99.9%, 99.99%, etc.):** Evaluating the reliability of your system.

## 2️⃣ Load Balancing 🖧 🏋

📌 **Why?** Distributes incoming traffic across multiple servers to prevent overload.

### Types of Load Balancers

- **DNS Load Balancing (e.g., Route 53):** Distributes traffic at the DNS level.
- **Application Load Balancer (ALB) (Layer 7, HTTP/HTTPS-based):** Routes traffic based on application-level
  information.
- **Network Load Balancer (NLB) (Layer 4, TCP-based):** Routes traffic based on network-level information.
- **Reverse Proxy (e.g., Nginx, HAProxy):** Acts as an intermediary between clients and servers.

### Load Balancing Algorithms

- **Round Robin:** Distributes requests sequentially.
- **Least Connections:** Routes requests to the server with the fewest active connections.
- **IP Hashing:** Routes requests based on the client's IP address.

## 3️⃣ Caching

📌 **Why?** Improves performance by reducing database calls.

### Types of Caching

- **Client-Side Cache (Browser cache, CDN):** Stores data on the client side.
- **Server-Side Cache (In-memory like Redis, Memcached):** Stores frequently accessed data in memory.
- **Database Caching (Read Replicas, Query Optimization):** Optimizes database performance.

### Cache Invalidation Strategies

- **Write-through:** Updates the cache and database simultaneously.
- **Write-back:** Updates the cache and writes to the database later.
- **Least Recently Used (LRU):** Evicts the least recently used items from the cache.

### CDN (Content Delivery Network) 🌐

- Distributes static content globally.
- Examples: Cloudflare, Akamai, AWS CloudFront.

## 4️⃣ Database Design ⛃

📌 **Choosing the right database:**

### Relational (SQL) – MySQL, PostgreSQL, Amazon RDS

- Strong consistency, ACID properties.
- Used for transactions, banking systems.

### NoSQL – MongoDB, Cassandra, DynamoDB

- Schema-less, scalable.
- Used for high-volume, unstructured data (social media, logs).

### Sharding vs. Replication 👥

- **Sharding:** Partitioning data across multiple servers.
- **Replication:** Copying data across multiple servers.

## 5️⃣ Microservices🧩 & API Design

📌 **Microservices vs. Monoliths**

- **Microservices:** Scalable, modular, independent.
- **Monolith:** Easier development but less scalable.

### Inter-service Communication

- **REST API:** Standard web-based communication.
- **gRPC:** High-performance RPC framework.
- **Message Queues (Kafka, RabbitMQ):** Asynchronous communication.

### API Gateway (Nginx, Kong, AWS API Gateway)

- Manages authentication, throttling, logging.

### Rate Limiting & Security

- OAuth, JWT for authentication.
- API Key-based access.
- Rate Limiting using Redis.

## 6️⃣ Message Queues»» & Event-Driven Architecture 

📌 **Why?** Decouples services, increases reliability.

### Message Brokers

- **Kafka (Distributed, durable):** High-throughput, fault-tolerant.
- **RabbitMQ (Lightweight, real-time messaging):** Flexible routing, reliable delivery.

### Event-Driven System

- Producers send events.
- Consumers process asynchronously.

### Use Cases

- Order processing in e-commerce.
- Logging & monitoring systems.

## 7️⃣ Distributed Storage & File Systems

📌 **Why?** Handle petabytes of data efficiently.

### Distributed File Systems

- HDFS (Hadoop Distributed File System).
- Google File System (GFS).

### Object Storage

- AWS S3, Google Cloud Storage.

### SQL vs. NoSQL for Storage

- SQL for transactions.
- NoSQL for high-volume, unstructured data.

## 8️⃣ Scaling Strategies

📌 **How to scale a system?**

### Vertical Scaling (Scale-Up)

- Adding more CPU/RAM to a single server.
- Limited by hardware capacity.

### Horizontal Scaling (Scale-Out)

- Adding more machines.
- Used in distributed systems.

### Database Scaling

- Read Replicas (for read-heavy systems).
- Partitioning (Sharding).

## 9️⃣ Observability & Monitoring

📌 **Why?** Debugging and performance tuning.

### Logging Tools

- ELK Stack (Elasticsearch, Logstash, Kibana).
- Splunk.

### Metrics & Monitoring

- Prometheus + Grafana (Real-time monitoring).
- AWS CloudWatch.

### Alerting Systems

- PagerDuty.
- OpsGenie.

## 🔟 System Design Case Studies

📌 **Common interview problems:**

- Design YouTube (Video storage, CDN, streaming).
- Design Uber (Real-time tracking, matching algorithms).
- Design Twitter (Timelines, caching, rate limiting).
- Design WhatsApp (Messaging queues, real-time sync).

📌 **How to Approach a System Design Interview?**

1. **Clarify Requirements:** Functional (What features are needed?), Non-functional (Latency, availability,
   scalability).
2. **Define High-Level Design:** Identify core components (API Gateway, Load Balancers, Databases, etc.).
3. **Break Down Components:** Database choice, caching strategy, API design.
4. **Address Scalability & Bottlenecks:** Vertical vs. Horizontal scaling, Optimize database queries.
5. **Discuss Trade-offs:** CAP theorem: Consistency vs. Availability.

## 📚 Recommended Study Resources

### Books

- Designing Data-Intensive Applications – Martin Kleppmann.
- The System Design Interview – Alex Xu.