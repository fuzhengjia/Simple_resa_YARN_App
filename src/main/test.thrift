namespace java com.test.thrift

enum RequestType {
    Say_hello,
    Query_time,
}

struct Request {
    1: required RequestType type;
    2: required string name;
    3: optional i32 age;
}


exception RequestException {
    1: required i32 code;
    2: optional string reason;
}

service HelloWorldService {
    string doAction(1: Request request) throws (1: RequestException qe);
}
