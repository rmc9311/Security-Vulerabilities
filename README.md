# CS-305

Briefly summarize your client, Artemis Financial, and their software requirements. Who was the client? What issue did they want you to address?

  Answer: Artemis Finacial is a finacial institution that helps clients keep track of their money, as well as invest and send money across platforms. The issues they wanted me to address was the security vulerabilities that could be in their system as well as implement a secure path to be able to implement a web based system.
  
What did you do very well when you found your client’s software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall wellbeing?

  Answer: I was able to correctly identify what sources would cause significant vulnerabilities as well as surpress false positives. This helped keep the data clear of misconception as well as helped future developers know what the real security problems would lay. Here are ways I did that:

Identifying Software Security Vulnerabilities:
Identifying software security vulnerabilities involves a comprehensive approach that includes:
Code Reviews: Carefully reviewing the codebase to identify potential vulnerabilities and security flaws.
Automated Testing: Using tools to perform static analysis, dynamic analysis, and vulnerability scanning to detect vulnerabilities.
Penetration Testing: Conducting controlled attacks on the software to identify potential entry points for malicious actors.
Security Audits: Evaluating the software architecture and design to identify potential security weaknesses.
Security Training: Educating developers about common security vulnerabilities and best practices.

Importance of Coding Securely:
Coding securely is crucial for several reasons:
Data Protection: Secure coding prevents unauthorized access to sensitive data, protecting user information and company data.
Preventing Exploits: Proper security practices help prevent exploitation of vulnerabilities by malicious actors.
Maintaining Reputation: Security breaches can damage a company's reputation and erode customer trust. Secure coding helps avoid such incidents.
Compliance: Many industries have regulatory requirements for data security. Coding securely helps meet compliance standards.
Cost Savings: Addressing security issues early in the development cycle is more cost-effective than fixing them after deployment.

Value of Software Security for a Company:
Risk Mitigation: Effective software security reduces the risk of data breaches, financial losses, and legal liabilities.
Customer Trust: Demonstrating a commitment to security builds customer trust, leading to stronger brand reputation and customer loyalty.
Business Continuity: Secure software reduces the likelihood of downtime due to security incidents, ensuring continuous operations.
Competitive Advantage: Companies that prioritize software security can differentiate themselves by offering more secure products and services.
Legal and Regulatory Compliance: Adhering to security best practices helps companies comply with data protection regulations.
  
  
What part of the vulnerability assessment was challenging or helpful to you?

  Answer: At first I struggled being able to identify how to supress the vulerabilies and what vulerabilities were false positives. This was challenging but worth the effort because it helped me greater appreciate the effort that goes into making sure the software and programs we use are secure.
  
How did you increase layers of security? In the future, what would you use to assess vulnerabilities and decide which mitigation techniques to use?

  Answer: I increased the layers of security by adding a certficate to the program as well as impletmenting a SHA256 encoding process. This helped generate a bit encoder that would help the messages stay secure as they went through the API.
  To help midigate vulerabilities I would still make sure to implement a secure API with a bit encoder. This will help the inut stay secure.
  
How did you make certain the code and software application were functional and secure?After refactoring the code, how did you check to see whether you introduced new vulnerabilities?

  Answer: I did a depenedency check to make sure that there were no vulnerabilities and if there were to check what to do to fix them. When I introduced a new vulnerability I checked to make sure the vulnerability wasn't a falsse positive. If it was I would supress it. If it was not I would check to see if there is a know solution and how to fix it.
  
What resources, tools, or coding practices did you use that might be helpful in future assignments or tasks?

  Answer: I used a marven dependency checker as well as OWSAP which is an open source website that has the vulnerabilities and fixes to those.
  
Employers sometimes ask for examples of work that you have successfully completed to show your skills, knowledge, and experience. What might you show future employers from this assignment?

  Answer: I would show them the ability to perform a sercurity check. Also, the ability to implement a encoding and certificate generation for input.
  
