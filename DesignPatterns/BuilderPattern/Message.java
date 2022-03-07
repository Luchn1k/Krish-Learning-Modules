/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderPattern;

/**
 *
 * @author Luchn1k
 */
public class Message {

    private final String message;
    private final String textColor;
    private final String textSize;
    private final String textStyle;
    private final String messageImage;

    private Message(MessageBuilder messageBuilder) {
        this.message = messageBuilder.message;
        this.textColor = messageBuilder.textColor;
        this.textSize = messageBuilder.textSize;
        this.textStyle = messageBuilder.textStyle;
        this.messageImage = messageBuilder.messageImage;
    }

    static class MessageBuilder {

        private final String message;
        private String textColor;
        private String textSize;
        private String textStyle;
        private String messageImage;

        public Message build() {
            return new Message(this);
        }

        public MessageBuilder(String messsage) {
            this.message = messsage;
        }

        public MessageBuilder textColor(String textColor) {
            this.textColor = textColor;
            return this;
        }

        public MessageBuilder textSize(String textSize) {
            this.textSize = textSize;
            return this;
        }

        public MessageBuilder textStyle(String textStyle) {
            this.textStyle = textStyle;
            return this;
        }

        public MessageBuilder messageImage(String messageImage) {
            this.messageImage = messageImage;
            return this;
        }

    }

    @Override
    public String toString() {
        return "New Message \n"
                + "Message: " + message + "\n"
                + "Text Color: " + (textColor == null ? "Black" : textColor) + "\n"
                + "Text Size: " + (textSize == null ? "12 px" : textSize) + "\n"
                + "Text Style: " + (textStyle == null ? "Reguler" : textStyle) + "\n"
                + "Message Image: " + (messageImage == null ? "Info" : messageImage);
    }

}
