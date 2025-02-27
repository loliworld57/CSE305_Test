package CommunicationManager;

class Message {
    private final String content;
    private final String sender;
    private final String recipient;

    public Message(String content, String sender, String recipient) {
        this.content = content;
        this.sender = sender;
        this.recipient = recipient;
    }
    // Getters for message properties
    public String getContent() {
        return content;
    }
    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }
	public void printSummary() {
		System.out.println("Content: " + this.content);
		System.out.println("Sender: " + this.sender);
		System.out.println("Recipient: " + this.recipient);
	}
    public void printDetails() {
        printSummary();
        System.out.println("Content Length: " + this.content.length());
        System.out.println("Sender Uppercase: " + this.sender.toUpperCase());
        System.out.println("Recipient Lowercase: " + this.recipient.toLowerCase());
    }
}
