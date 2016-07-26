package io.pivotal;

class Message {
    private String body;

    Message(String body) {
        this.body = body;
    }

    @SuppressWarnings("unused") // JSON Serialization
    public String getBody() {
        return body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Message message = (Message) o;

        return body != null ? body.equals(message.body) : message.body == null;
    }

    @Override
    public int hashCode() {
        return body != null ? body.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Message{" +
                "body='" + body + '\'' +
                '}';
    }
}
