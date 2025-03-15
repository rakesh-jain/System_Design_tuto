System Desing Pattern
1️⃣ Fundamentals of System Design
Key Concepts
✅ Scalability (Vertical vs. Horizontal)
✅ High Availability & Fault Tolerance
✅ Consistency, Availability, Partition Tolerance (CAP Theorem)
✅ Latency vs. Throughput
✅ Load Balancing

Important Metrics
🔹 Response Time (P50, P95, P99 latency)
🔹 Requests per second (RPS/QPS)
🔹 System Uptime (99.9%, 99.99%, etc.)

2️⃣ Load Balancing
📌 Why? Distributes incoming traffic across multiple servers to prevent overload.

🔹 Types of Load Balancers:

DNS Load Balancing (e.g., Route 53)
Application Load Balancer (ALB) (Layer 7, HTTP/HTTPS-based)
Network Load Balancer (NLB) (Layer 4, TCP-based)
Reverse Proxy (e.g., Nginx, HAProxy)
🔹 Load Balancing Algorithms:

Round Robin
Least Connections
IP Hashing
3️⃣ Caching
📌 Why? Improves performance by reducing database calls.


1. What is Load Balancing?
   Load balancing is the process of distributing network traffic or computational workloads across multiple servers to ensure that no single machine is overwhelmed, leading to improved performance, reliability, and availability of applications.

It acts as a traffic manager by distributing incoming requests across multiple backend servers (instances) in an efficient and fault-tolerant manner.

2. Why is Load Balancing Important?
   Without load balancing:

A single server could become overloaded and fail.
Application response times could increase.
There is no redundancy, leading to downtime if the server crashes.
With load balancing: ✅ High Availability – If one server goes down, traffic is redirected.
✅ Improved Performance – Evenly distributed workload prevents overloading.
✅ Scalability – Supports horizontal scaling by adding/removing servers.
✅ Fault Tolerance – If a server fails, the load balancer automatically routes traffic to healthy ones.

3. Types of Load Balancing
   Load balancing can be hardware-based (dedicated appliances) or software-based (cloud solutions, open-source tools).

A. Network-Level Load Balancing
🔹 Operates at Layer 4 (Transport Layer) of the OSI model.
🔹 Uses IP addresses and ports to distribute traffic.
🔹 Faster but lacks application-level intelligence.

Examples:

AWS Elastic Load Balancer (ELB) (Layer 4 mode)
Google Cloud Load Balancer (L4)
HAProxy (TCP mode)
B. Application-Level Load Balancing
🔹 Works at Layer 7 (Application Layer).
🔹 Uses URLs, headers, cookies to route requests intelligently.
🔹 Allows content-based routing (e.g., sending /images requests to a different server).

Examples:

Nginx
HAProxy (HTTP mode)
AWS ALB (Application Load Balancer)
Traefik
4. Load Balancing Algorithms
   Load balancers use different algorithms to decide where to route requests.

A. Static Load Balancing Algorithms
🔹 These do not consider the current load of servers.
🔹 Good for predictable, evenly distributed workloads.

Round Robin 🏀

Requests are sent to servers in sequence.
Works well for equally powerful servers.
Example: If there are 3 servers (A, B, C), requests go A → B → C → A → B → C...
Weighted Round Robin ⚖️

Assigns a weight to each server based on capacity.
Example: If Server A has weight 3 and Server B has weight 1, A gets 3x more traffic than B.
IP Hashing 🗺️

Uses the client's IP address to always route requests to the same server.
Good for session persistence.
B. Dynamic Load Balancing Algorithms
🔹 These consider server load, CPU usage, response time, etc.
🔹 Good for cloud applications and unpredictable traffic.

Least Connections 🔄

Sends traffic to the server with the fewest active connections.
Good for long-lived connections (e.g., WebSockets, video streaming).
Least Response Time ⏳

Chooses the server with the fastest response time.
Ensures low latency requests.
Least Bandwidth 📡

Routes requests to the server handling the least amount of data transfer.
Custom Load Balancing (AI/ML-based) 🤖

Uses AI to predict traffic spikes and optimize routing dynamically.
Used in Netflix, Google Cloud, and AWS.
5. Load Balancer Architectures
   A. Global Load Balancer
   Distributes traffic across multiple data centers.
   Example: Google Cloud HTTP(S) Load Balancer.
   B. Local Load Balancer
   Distributes traffic within a single data center.
   Example: Nginx, HAProxy.
   C. Client-Side vs. Server-Side Load Balancing
   Type	How It Works	Example
   Client-Side LB	Clients directly pick a server from a list.	gRPC, DNS Round Robin
   Server-Side LB	Load balancer manages traffic distribution.	Nginx, AWS ALB
6. Real-World Examples
   Google Search: Uses geo-distributed load balancers to serve billions of users efficiently.
   Netflix: Uses intelligent load balancing with AI/ML for video streaming.
   AWS ELB: Balances traffic across EC2 instances in AWS cloud.
7. Load Balancer Deployment
   A. Hardware-Based
   Dedicated load balancer appliances.
   Expensive but high-performance.
   B. Software-Based
   Open-source solutions like Nginx, HAProxy.
   Cloud-based solutions like AWS, Azure, GCP.
8. Challenges in Load Balancing
   🚨 Session Persistence:

Some apps (e.g., banking) require users to stay on the same server (sticky sessions).
Solution: Use IP Hashing or Cookies.
🚨 Latency Issues:

Load balancers can become a bottleneck.
Solution: Use multiple distributed load balancers.
🚨 Health Checks:

Unhealthy servers should not receive traffic.
Solution: Load balancer performs regular health checks.
9. Conclusion
   Load balancing is essential for modern web applications, ensuring high availability, performance, and fault tolerance. The choice of static vs. dynamic algorithms, hardware vs. software, and local vs. global load balancers depends on the use case.

Would you like help setting up a load balancer for a specific application (e.g., Spring Boot, Flask, Kubernetes)? 🚀

🔹 Types of Caching:

Client-Side Cache (Browser cache, CDN)
Server-Side Cache (In-memory like Redis, Memcached)
Database Caching (Read Replicas, Query Optimization)
🔹 Cache Invalidation Strategies:

Write-through
Write-back
Least Recently Used (LRU)
🔹 CDN (Content Delivery Network):

Distributes static content globally
Examples: Cloudflare, Akamai, AWS CloudFront
4️⃣ Database Design
📌 Choosing the right database:

🔹 Relational (SQL) – MySQL, PostgreSQL, Amazon RDS

Strong consistency, ACID properties
Used for transactions, banking systems
🔹 NoSQL – MongoDB, Cassandra, DynamoDB

Schema-less, scalable
Used for high-volume, unstructured data (social media, logs)
🔹 Sharding vs. Replication:

Sharding → Partitioning data across multiple servers
Replication → Copying data across multiple servers
5️⃣ Microservices & API Design
📌 Microservices vs. Monoliths

Microservices → Scalable, modular, independent
Monolith → Easier development but less scalable
🔹 Inter-service Communication:

REST API
gRPC
Message Queues (Kafka, RabbitMQ)
🔹 API Gateway (Nginx, Kong, AWS API Gateway)

Manages authentication, throttling, logging
🔹 Rate Limiting & Security

OAuth, JWT for authentication
API Key-based access
Rate Limiting using Redis
6️⃣ Message Queues & Event-Driven Architecture
📌 Why? Decouples services, increases reliability.

🔹 Message Brokers:

Kafka (Distributed, durable)
RabbitMQ (Lightweight, real-time messaging)
🔹 Event-Driven System:

Producers send events
Consumers process asynchronously
🔹 Use Cases:

Order processing in e-commerce
Logging & monitoring systems
7️⃣ Distributed Storage & File Systems
📌 Why? Handle petabytes of data efficiently.

🔹 Distributed File Systems:

HDFS (Hadoop Distributed File System)
Google File System (GFS)
🔹 Object Storage:

AWS S3, Google Cloud Storage
🔹 SQL vs. NoSQL for Storage:

SQL for transactions
NoSQL for high-volume, unstructured data
8️⃣ Scaling Strategies
📌 How to scale a system?

🔹 Vertical Scaling (Scale-Up)

Adding more CPU/RAM to a single server
Limited by hardware capacity
🔹 Horizontal Scaling (Scale-Out)

Adding more machines
Used in distributed systems
🔹 Database Scaling:

Read Replicas (for read-heavy systems)
Partitioning (Sharding)
9️⃣ Observability & Monitoring
📌 Why? Debugging and performance tuning.

🔹 Logging Tools:

ELK Stack (Elasticsearch, Logstash, Kibana)
Splunk
🔹 Metrics & Monitoring:

Prometheus + Grafana (Real-time monitoring)
AWS CloudWatch
🔹 Alerting Systems:

PagerDuty
OpsGenie
🔟 System Design Case Studies
📌 Common interview problems:
🔹 Design YouTube (Video storage, CDN, streaming)
🔹 Design Uber (Real-time tracking, matching algorithms)
🔹 Design Twitter (Timelines, caching, rate limiting)
🔹 Design WhatsApp (Messaging queues, real-time sync)

📌 How to Approach a System Design Interview?
1️⃣ Clarify Requirements

Functional (What features are needed?)
Non-functional (Latency, availability, scalability)
2️⃣ Define High-Level Design

Identify core components (API Gateway, Load Balancers, Databases, etc.)
3️⃣ Break Down Components

Database choice, caching strategy, API design
4️⃣ Address Scalability & Bottlenecks

Vertical vs. Horizontal scaling
Optimize database queries
5️⃣ Discuss Trade-offs

CAP theorem: Consistency vs. Availability
📚 Recommended Study Resources
📘 Books:

Designing Data-Intensive Applications – Martin Kleppmann
The System Design Interview – Alex Xu