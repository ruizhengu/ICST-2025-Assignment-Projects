from openai import OpenAI

client = OpenAI(api_key="")


def get_response(prompt):
    response = client.chat.completions.create(model="gpt-3.5-turbo",
    messages=[
        {"role": "system", "content": "You are a helpful assistant."},
        {"role": "user", "content": prompt},
    ],
    max_tokens=1000,  # Adjust based on how long you expect the response to be
    temperature=0.7)
    return response.choices[0].message.content

user_input = "give me some affordable travel destinations in Europe from Manchester Airport before Christmas"
chatgpt_response = get_response(user_input)
print(chatgpt_response)